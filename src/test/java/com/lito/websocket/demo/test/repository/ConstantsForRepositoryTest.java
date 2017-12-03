package com.lito.websocket.demo.test.repository;

import java.util.Date;

import com.lito.websocket.demo.entity.UserEntity;

/**
 * Constants for repository test only
 * 
 * @author rapalisv
 *
 */
public final class ConstantsForRepositoryTest {
  public static final String USER_NAME = "UserName";
  public static final Date LOGIN_DATE = new Date();
  public static final Date REGISTRATION_DATE = new Date();
  private static final String USER_EMAIL = "user@email.com";
  public static final UserEntity USER_ENTITY = UserEntity.builder()
      .name(USER_NAME)
      .loginDate(LOGIN_DATE)
      .registrationDate(REGISTRATION_DATE)
      .email(USER_EMAIL)
      .build();
}
