package com.lito.websocket.demo.test.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Repository configuration class for testing only
 * 
 * @author rapalisv
 *
 */
@TestConfiguration
@Profile("repository-test")
public class RepositoryTestConfiguration {
  /**
   * @return {@link CommandLineRunner}
   */
  @Bean
  public CommandLineRunner createCommandLineRunner() {
    return (args) -> {
      
    };
  }
}
