package dev.lzothmeni.kafkastart.web.controller;

import dev.lzothmeni.kafkastart.producer.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
@AllArgsConstructor
public class MessageController {

    private final KafkaProducer kafkaProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);

        return "Message sent successfully";
    }
}
