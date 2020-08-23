package com.example.springbootkafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootkafkaproducer.model.User;

@RestController
public class SpringKafkaController {
	
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	private static final String TOPIC= "Kafka_Example_Json-0";
	
	@GetMapping("/mq/{value}")
	public void sendMessageToQueue(@PathVariable("value") String value) {
		System.out.println("Message sent is " + value);
		kafkaTemplate.send(TOPIC, new User(value, 700000L));
	}

}
