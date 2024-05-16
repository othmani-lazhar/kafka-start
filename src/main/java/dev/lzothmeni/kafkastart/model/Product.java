package dev.lzothmeni.kafkastart.model;

import lombok.Builder;

@Builder
public record Product(int id, String name, double price) {
}
