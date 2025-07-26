package com.backend.api.service;

import com.backend.api.model.Product;
import com.backend.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> create(Product product){
        productRepository.save(product);
        return list();
    }

    public List<Product> list(){
        return productRepository.findAll();
    }

    public List<Product> update(Product product){
        productRepository.save(product);
        return list();
    }

    public List<Product> delete(String id){
        productRepository.deleteById(id);
        return list();
    }

}
