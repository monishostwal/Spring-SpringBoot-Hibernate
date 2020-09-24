package com.example.demo;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Sender {
	private final static String QUEUE_NAME="queue-1";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory factory=new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection=factory.newConnection();
		Channel channel=connection.createChannel();
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		String message="Hello Ayush From Sender via Rabbit MQ";
		channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		System.out.println("Message Hase been Sent Successfully to Rabbit MQ.");
		
		

	}

}
