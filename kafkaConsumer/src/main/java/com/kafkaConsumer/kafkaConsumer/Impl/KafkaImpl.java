package com.kafkaConsumer.kafkaConsumer.Impl;

import com.kafkaConsumer.kafkaConsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaImpl {

    @KafkaListener(topics="Kafka_Example_String", groupId = "group_id")
    public void consume(String message) {
        System.out.println(message);
    }

    @KafkaListener(topics="Kafka_Example", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeJSON(User user) {
        System.out.println(user);
    }

}
