package com.lito.websocket.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

	@MessageMapping("/message")
	@SendTo("/message")
	public String getMessage(String msg) {
		return msg;
	}
}