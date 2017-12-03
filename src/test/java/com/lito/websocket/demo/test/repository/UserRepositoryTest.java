package com.lito.websocket.demo.test.repository;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import com.lito.websocket.demo.entity.UserEntity;
import com.lito.websocket.demo.repository.UserRepository;
import com.lito.websocket.demo.test.AbstractRepositotyTest;

public class UserRepositoryTest extends AbstractRepositotyTest {
  @Autowired
  private UserRepository userRepository;
  private UserEntity savedUserEntity;

  /**
   * Run befor each test method execution
   */
  @Before
  public void beforEachUserRepositoryTest() {
    savedUserEntity = userRepository.save(ConstantsForRepositoryTest.USER_ENTITY);
  }

  /**
   * Test the context needed for this test
   */
  @Test
  public void contextIsNotNullTest() {
    assertThat(userRepository).isNotNull();
  }

  /**
   * Find one user test for {@link UserRepository#findOne(Long)}
   */
  @Test
  public void findOneUserTest() {
    Optional<UserEntity> foundedUser = userRepository.findOne(savedUserEntity.getId());
    assertThat(foundedUser.isPresent()).isTrue();
  }
}
