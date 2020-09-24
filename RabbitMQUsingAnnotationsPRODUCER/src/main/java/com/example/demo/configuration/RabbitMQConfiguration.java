package com.example.demo.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.ConnectionFactory;



@Component
public class RabbitMQConfiguration {
	public static final String QUEUE_NAME="laptop_display_queue";
	public static final String TOPIC_EXCHANGE="laptop_exchange";
	
	@Bean
	Queue queue() {
		return new Queue(QUEUE_NAME,false);
	}
	
	@Bean
	TopicExchange topicExchange() {
		return new TopicExchange(TOPIC_EXCHANGE);
	}
	
	@Bean 
	Binding binding(Queue queue,TopicExchange topicExchange) {
		return BindingBuilder.bind(queue).to(topicExchange).with("message_routing_key");
		
	}
	
	@Bean
	ConnectionFactory connectionFactory() {
		ConnectionFactory factory=new ConnectionFactory();
		factory.setHost("localhost");
		return factory;
	}

}
