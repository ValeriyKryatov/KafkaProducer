package com.kafkademo.KafkaProducer.service;

import com.kafkademo.KafkaProducer.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSenderExample {

    private final KafkaTemplate<String, Message> kafkaTemplate;

    @Autowired
    KafkaSenderExample(KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Message message, String topicName) {
        kafkaTemplate.send(topicName, message);
    }
}