package com.backend.api.dto;
import com.backend.api.model.Product;

public record ProductResponseDTO(String id,String name, double price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
