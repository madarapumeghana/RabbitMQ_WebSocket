package com.SecureWebSocketDemo.ClientServerTest;

public class CustomMessage {
	private String text;

	public void setText(String text) {
		this.text = text;
	}

	private String to;

	public String getText() {
		return text;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "CustomMessage [text=" + text + "]";
	}
	
	
}
