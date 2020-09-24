package com.example.demo;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Reciever {

	private static String QUEUE_NAME="queue-1";
	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory factory=new ConnectionFactory();
		
		Connection connection=factory.newConnection();
		Channel channel=connection.createChannel();
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		System.out.println("WAiting for message");
		DeliverCallback delivercallback=(consumerTag,delivery)->{
			String message=new String(delivery.getBody());
			System.out.println("Message Recieved : "+message);		
		};
		channel.basicConsume(QUEUE_NAME, true, delivercallback,consumerTag->{});
	}
}
