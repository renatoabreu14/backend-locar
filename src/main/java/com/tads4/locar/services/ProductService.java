package com.tads4.locar.services;

import java.util.List;
import java.util.stream.Collectors;

import com.tads4.locar.dto.ProductDTO;
import com.tads4.locar.entities.Product;
import com.tads4.locar.mapper.ProductMapper;
import com.tads4.locar.repesotories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    private final ProductMapper productMapper = ProductMapper.INSTANCE;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAll();
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }
}
