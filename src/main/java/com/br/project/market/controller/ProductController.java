package com.br.project.market.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.project.market.domain.Product;

@RestController
@RequestMapping("product")
public class ProductController {
    // localhost:8080/product/list
    @GetMapping(path = "list")
    public List<Product> list() {
        return List.of(new Product("Arroz"), new Product("Feijão"));
    }

}
