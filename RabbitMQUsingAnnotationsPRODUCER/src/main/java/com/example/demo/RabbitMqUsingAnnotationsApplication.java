package com.example.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.configuration.RabbitMQConfiguration;
import com.example.demo.model.Laptop;

@SpringBootApplication
public class RabbitMqUsingAnnotationsApplication implements CommandLineRunner{
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqUsingAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Laptop laptop=new Laptop();
		laptop.setId(10);
		laptop.setBrand("Asus");
		laptop.setLaptop_owner_name("Monish Ostwal");
		System.out.println("Sending Message");
		rabbitTemplate.convertAndSend(RabbitMQConfiguration.TOPIC_EXCHANGE,"message_routing_key",laptop);
		System.out.println("Message Sent Successfully");
		
		
	}
	
	

}
