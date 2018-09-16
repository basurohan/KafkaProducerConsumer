package com.kafkaProducer.kafkaProducer.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import com.kafkaProducer.kafkaProducer.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("kafka")
public class KafkaImpl {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";

    @GetMapping("/publish")
    public void post() {
        kafkaTemplate.send(TOPIC, new User("John", "Engineering", 50000L));
        kafkaTemplate.send(TOPIC, new User("Mark", "Management", 60000L));
        kafkaTemplate.send(TOPIC, new User("Jack", "Design", 40000L));
    }

}
