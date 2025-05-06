package com.br.project.market.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.project.market.domain.Product;

@Service
public class ProductService {
    private final List<Product> products = List.of(new Product(1L, "Arroz", 10), new Product(2L, "Feijão", 5));

    public List<Product> listAll() {
        return products;
    }

    public Product findById(long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Product not Found"));
    }
}
