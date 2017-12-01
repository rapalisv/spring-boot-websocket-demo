package com.lito.websocket.demo.service;

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
public class UserService {
  private UserRepository userRepository;
  private BiMapping<User, UserEntity> userMapping;

  /**
   * Save user
   * 
   * @param user
   * @return persisted {@link User}
   */
  public User saveUser(@NonNull final User user) {
    UserEntity persistedUser = userMapping.mapToEntity(user);
    persistedUser = userRepository.save(persistedUser);
    return userMapping.mapToDomain(persistedUser);
  }

}
