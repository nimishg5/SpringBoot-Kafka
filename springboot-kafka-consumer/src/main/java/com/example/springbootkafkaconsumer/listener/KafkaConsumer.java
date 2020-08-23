package com.example.springbootkafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.springbootkafkaconsumer.model.User;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example_Json-0", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
