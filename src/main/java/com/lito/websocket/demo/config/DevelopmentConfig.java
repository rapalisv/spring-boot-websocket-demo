package com.lito.websocket.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Configuration for development mode
 * 
 * @author rapalisv
 *
 */
@Configuration
@Profile("development")
public class DevelopmentConfig {

  /**
   * @return {@link CommandLineRunner}
   */
  @Bean
  public CommandLineRunner createCommandLineRunner() {
    return (args)-> {
      
    };
  }
}
