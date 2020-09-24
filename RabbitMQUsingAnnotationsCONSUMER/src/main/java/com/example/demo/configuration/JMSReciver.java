package com.example.demo.configuration;

import java.io.ByteArrayInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import com.example.demo.model.Laptop;
import com.rabbitmq.client.Channel;

@Component
public class JMSReciver implements ChannelAwareMessageListener {

	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		byte[] bytes=message.getBody();
		ByteArrayInputStream input=new ByteArrayInputStream(bytes);
		ObjectInput oi=new ObjectInputStream(input);
		Laptop product=(Laptop) oi.readObject();
		System.out.println(product.getBrand());
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
	}

}
