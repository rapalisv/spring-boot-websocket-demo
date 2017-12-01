package com.lito.websocket.demo.entity;

import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserInChat entity
 * @author rapalisv
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_IN_CHAT_GROUP")
public class UserInChat {
  /** Entity field ids **/
  @EmbeddedId
  private UserInChatCompositeKey ids;
  
  /** Entity fields **/
  @ManyToOne
  @JoinColumn(name = "USER_ID", referencedColumnName = "ID", insertable=false, updatable=false)
  private UserEntity user;
  
  @JoinColumn(name = "CHAT_ID", referencedColumnName = "ID", insertable=false, updatable=false)
  @ManyToOne
  private ChatEntity chat;
  
  /** Entity relations **/
  @OneToMany(mappedBy="userInChat")
  private List<MessageEntity> messages;
}
