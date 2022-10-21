package com.SecureWebSocketDemo.ClientServerTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class MsgController {
	@Autowired
	SimpMessagingTemplate simpMessagingTemplate;

	@MessageMapping("/application")
	@SendTo("/all/messages")
	public CustomMessage send(final CustomMessage message) throws Exception {
		return message;
	}

	public void sendMsgfromServer(CustomMessage message) {
		simpMessagingTemplate.convertAndSend("/all/messages", message);
	}

}
