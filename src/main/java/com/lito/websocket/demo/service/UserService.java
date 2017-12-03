package com.lito.websocket.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.lito.websocket.demo.domain.ui.contract.User;
import com.lito.websocket.demo.entity.UserEntity;
import com.lito.websocket.demo.mapper.BiMapping;
import com.lito.websocket.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * User service class
 * 
 * @author rapalisv
 *
 */
@Service
@AllArgsConstructor
public class UserService extends AbstractService<User, Long> {

  /*** Class dependencies ***/
  private UserRepository userRepository;
  private BiMapping<User, UserEntity> userMapping;

  /**
   * Save user
   * 
   * @param user
   * @return persisted {@link User}
   */
  @Override
  public User save(@NonNull final User user) {
    UserEntity persistedUser = userMapping.mapToEntity(user);
    persistedUser = userRepository.save(persistedUser);
    return userMapping.mapToDomain(persistedUser);
  }


  @Override
  public Optional<User> findOne(@NonNull Long entityId) {
    Optional<UserEntity> findedUserEntity = userRepository.findOne(entityId);
    return findedUserEntity.map(userMapping::mapToDomain);
  }

  @Override
  public void delete(@NonNull Long entityId) {
    userRepository.delete(entityId);
  }


  @Override
  public List<User> findAll() {
    return userRepository.findAll()
        .map(userMapping::mapToDomain)
        .collect(Collectors.toList());
  }


  @Override
  public List<User> findAll(Iterable<Long> ids) {
    // TODO Auto-generated method stub
    return null;
  }

}
