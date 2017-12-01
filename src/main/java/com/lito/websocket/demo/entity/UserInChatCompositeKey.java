package com.lito.websocket.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class UserInChatCompositeKey implements Serializable {
  private static final long serialVersionUID = 1L;
  @Column(name = "USER_ID", updatable = false, nullable = false, unique = true, insertable = true)
  private Long userId;
  @Column(name = "CHAT_ID", updatable = false, nullable = false, unique = true, insertable = true)
  private Long chatId;
}
