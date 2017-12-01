package com.lito.websocket.demo.domain.ui.contract;

import lombok.Value;

/**
 * User domain class
 * @author rapalisv
 *
 */
@Value
public class User {
  private Long id;
  private String name;
  private String email;
}
