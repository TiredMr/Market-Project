package com.br.project.market.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.project.market.domain.Product;
import com.br.project.market.service.ProductService;
import com.br.project.market.util.DateUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("products")
@Log4j2
@RequiredArgsConstructor
public class ProductController {
    private final DateUtil dateUtil;
    private final ProductService productService;

    // localhost:8080/products
    @GetMapping
    public ResponseEntity<List<Product>> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));

        return ResponseEntity.ok(productService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable long id) {
        return ResponseEntity.ok(productService.findById(id));
    }

}
