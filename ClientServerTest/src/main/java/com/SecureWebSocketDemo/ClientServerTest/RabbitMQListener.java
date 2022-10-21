package com.SecureWebSocketDemo.ClientServerTest;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener implements MessageListener {

	private final MsgController msgcontroller;

	public RabbitMQListener(MsgController msgcontroller) {
		this.msgcontroller = msgcontroller;
	}

	public void onMessage(Message message) {
		CustomMessage msg = new CustomMessage();
		msg.setText(new String(message.getBody()));
		this.msgcontroller.sendMsgfromServer(msg);
	}

}
