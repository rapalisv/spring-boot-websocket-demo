package com.lito.websocket.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Message entity
 * @author rapalisv
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MESSAGE")
public class MessageEntity {
  /** Entity field id **/
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID", updatable = false, nullable = false, unique = true, insertable = true)
  private Long id;
  
  /** Entity fields **/
  @Column(name="MESSAGE", length=500, nullable=false, updatable=true)
  private String message;
  
  @Column(name="CREATION_DATE")
  @Temporal(TemporalType.DATE)
  private Date creationDate;
  
  /** Entity relations **/
  @ManyToOne
  private UserInChat userInChat;
}
