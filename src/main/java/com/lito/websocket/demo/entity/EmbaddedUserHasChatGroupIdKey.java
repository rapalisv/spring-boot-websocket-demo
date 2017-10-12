package com.lito.websocket.demo.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EmbaddedUserHasChatGroupIdKey implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long user_id;
	private Long chat_group_id;
}
