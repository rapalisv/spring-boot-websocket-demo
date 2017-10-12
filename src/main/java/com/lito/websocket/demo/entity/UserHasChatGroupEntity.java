package com.lito.websocket.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_HAS_CHAT_GROUP")
public class UserHasChatGroupEntity {

  @EmbeddedId
  private EmbaddedUserHasChatGroupIdKey keys;

  @ManyToOne
  @JoinColumn(name = "USER_ID", referencedColumnName = "ID", insertable = false, updatable = false)
  UserEntity user;

  @ManyToOne
  @JoinColumn(name = "CHAT_GROUP_ID", referencedColumnName = "ID", insertable = false,
      updatable = false)
  ChatGroupEntity chat;
}
