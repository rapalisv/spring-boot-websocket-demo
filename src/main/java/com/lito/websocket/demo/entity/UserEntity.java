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
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User entity
 * 
 * @author rapalisv
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USER")
public class UserEntity {
  /** Entity field id **/
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID", updatable = false, nullable = false, unique = true, insertable = true)
  private Long id;

  /** Entity fields **/
  @Column(name = "NAME", length = 60, updatable = false)
  private String name;

  @Column(name = "EMAIL", length = 60, nullable = false, updatable = true, unique = true)
  private String email;

  @Column(name = "REGISTRATION_DATE", updatable = false)
  @Temporal(TemporalType.DATE)
  private Date registrationDate;

  @Column(name = "LOGIN_DATE", updatable = true)
  @Temporal(TemporalType.DATE)
  private Date loginDate;

  /** Entity relations **/
  @OneToMany(mappedBy = "user")
  private List<UserInChat> chats;
}
