package com.kafkaProducer.kafkaProducer;

import com.kafkaProducer.kafkaProducer.Impl.KafkaImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaProducerApplication.class, args);

	}
}
