package com.backend.api.controller;

import com.backend.api.model.Product;
import com.backend.api.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    ResponseEntity<List<Product>> create(@RequestBody Product product){
        List<Product> products = productService.create(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(products);
    }

    @GetMapping
    List<Product> list(){
        return productService.list();
    }

    @PutMapping
    List<Product> update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping("{id}")
    List<Product> delete(@PathVariable("id") String id){
        return productService.delete(id);
    }

}
