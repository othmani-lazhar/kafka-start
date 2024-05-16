package dev.lzothmeni.kafkastart.web.controller;

import dev.lzothmeni.kafkastart.model.Product;
import dev.lzothmeni.kafkastart.producer.KafkaJsonProducer;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("")
    public ResponseEntity<String> save(@RequestBody Product product) {
        kafkaJsonProducer.saveProduct(product);

        return ResponseEntity.ok("Product saved successfully");
    }
}
