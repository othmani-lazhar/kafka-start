package dev.lzothmeni.kafkastart.consumer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "product", groupId = "my-group")
    public void consumeMessage(String message) {
        log.info("Consuming message: {}", message);
        System.out.println("Consumed message: " + message);
    }
}
