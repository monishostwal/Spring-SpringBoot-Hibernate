package com.example.demo.configuration;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.rabbitmq.client.ConnectionFactory;


@Controller
public class RabbitMQConfiguration {
	public static final String QUEUE_NAME="laptop_display_queue";
	public static final String EXCHANGE_NAME="laptop_exchange";

	@Bean
	Queue queue() {
		return new Queue(QUEUE_NAME,false);
	}
	
	@Bean
	TopicExchange topicExchange() {
		return new TopicExchange(EXCHANGE_NAME);
	}
	
	@Bean
	Binding binding(Queue queue,TopicExchange topicExchange) {
		return BindingBuilder.bind(queue).to(topicExchange).with("message_routing_key");
	}
	
	@Bean 
	ConnectionFactory connectionfactory() {
		ConnectionFactory factory=new ConnectionFactory();
		factory.setHost("localhost");
		return factory;
		
	}
	
	
	@Bean
	SimpleMessageListenerContainer container(org.springframework.amqp.rabbit.connection.ConnectionFactory connectionFactory,MessageListenerAdapter messageListenerAdapter) {
		SimpleMessageListenerContainer messageContainer=new SimpleMessageListenerContainer();
		messageContainer.setConnectionFactory(connectionFactory);
		messageContainer.setAcknowledgeMode(AcknowledgeMode.MANUAL);
		messageContainer.setQueueNames(QUEUE_NAME);
		messageContainer.setMessageListener(messageListenerAdapter);
		return messageContainer;
	}
	
	@Bean
	MessageListenerAdapter messageListenerAdapter(JMSReciver jmsReciver) {
		return new MessageListenerAdapter(jmsReciver,"recieved message");
	}
}
