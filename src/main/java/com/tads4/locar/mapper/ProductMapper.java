package com.tads4.locar.mapper;

import com.tads4.locar.dto.ProductDTO;
import com.tads4.locar.entities.Product;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product toModel (ProductDTO productDTO);

    ProductDTO toDTO (Product product);
    
}
