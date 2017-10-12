package com.lito.websocket.demo.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MESSAGE")
public class MessageEntity {
	@Id
	private Long id;
	
	private String message;
	
	@Temporal(TemporalType.DATE)
	private Date creation_date;
}
