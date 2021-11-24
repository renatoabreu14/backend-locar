package com.tads4.locar.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.tads4.locar.dto.ProductDTO;
import com.tads4.locar.entities.Product;
import com.tads4.locar.repesotories.ProductRepository;
import com.tads4.locar.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;
    /*@Autowired
    private ProductRepository repository;*/
    
    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<ProductDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
        //return service.findAll();
        //return repository.findAll();
    }
    
}
