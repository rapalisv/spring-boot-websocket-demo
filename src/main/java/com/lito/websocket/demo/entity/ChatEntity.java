package com.lito.websocket.demo.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Chat entity
 * @author rapalisv
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CHAT")
public class ChatEntity {
  /** Entity field id **/
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID", updatable = false, nullable = false, unique = true, insertable = true)
  private Long id;
  
  /** Entity fields **/
  @Column(name = "NAME", nullable = false, updatable = true, length = 60)
  private String chatName;
  
  @Column(name="CREATION_DATE")
  @Temporal(TemporalType.DATE)
  private Date creationDate;

  /** Entity relations **/
  @OneToMany(mappedBy = "chat")
  private List<UserInChat> users;
}
