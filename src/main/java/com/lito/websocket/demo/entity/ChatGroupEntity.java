package com.lito.websocket.demo.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CHAT_GROUP")
public class ChatGroupEntity {
	@Id
	private Long id;
	private String name;

	@OneToMany(mappedBy="chat")
	List<UserHasChatGroupEntity> userHasChats;
	
}
