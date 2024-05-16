package dev.lzothmeni.kafkastart.producer;

import dev.lzothmeni.kafkastart.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaJsonProducer {
    private final KafkaTemplate<String, Product> kafkaTemplate;


    public void saveProduct(Product product) {
        log.info("Sending product to product topic: {}", product);
        var message = MessageBuilder
                .withPayload(product)
                .setHeader(KafkaHeaders.TOPIC, "product")
                .build();

        kafkaTemplate.send(message);
    }
}
