package dev.lzothmeni.kafkastart.consumer;

import dev.lzothmeni.kafkastart.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaJsonConsumer {

    @KafkaListener(topics = "product", groupId = "my-group")
    public void consumeMessage(Product product) {
        log.info("Consuming message: {}", product);
        System.out.println("Consumed message: " + product);
    }
}
