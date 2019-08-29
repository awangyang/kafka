package com.example.kafkaconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author wangyang
 * @date 2019/06/05
 */
@Component
public class Listener {
    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.println(record.key());
        System.out.println(record.value());
    }
}
