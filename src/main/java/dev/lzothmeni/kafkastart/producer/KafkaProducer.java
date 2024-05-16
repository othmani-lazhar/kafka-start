package dev.lzothmeni.kafkastart.producer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String message) {
        log.info("Sending message to product topic: {}", message);
        kafkaTemplate.send("product", message);
    }
}
