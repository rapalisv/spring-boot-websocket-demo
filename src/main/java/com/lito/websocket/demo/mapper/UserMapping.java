package com.lito.websocket.demo.mapper;

import org.springframework.stereotype.Component;
import com.lito.websocket.demo.domain.ui.contract.User;
import com.lito.websocket.demo.entity.UserEntity;
import lombok.NonNull;

/**
 * Mapping implementation between {@link User} and {@link UserEntity}
 * 
 * @author rapalisv
 *
 */
@Component
public final class UserMapping implements BiMapping<User, UserEntity> {

  @Override
  public User mapToDomain(@NonNull final UserEntity entity) {
    User user = new User(entity.getId(), entity.getName(), entity.getEmail());
    return user;
  }

  @Override
  public UserEntity mapToEntity(@NonNull final User domain) {
    return UserEntity.builder()
        .id(domain.getId())
        .name(domain.getName())
        .email(domain.getEmail())
        .build();
  }

}
