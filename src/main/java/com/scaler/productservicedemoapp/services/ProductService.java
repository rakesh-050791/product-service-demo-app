package com.scaler.productservicedemoapp.services;

import com.scaler.productservicedemoapp.dtos.ProductDto;
import com.scaler.productservicedemoapp.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id);

    List<Product> getAllProducts();

    List<ProductDto> getAllProductsDTO();

    Product addNewProduct(Product product);

    Product replaceProduct(Long id, Product product);
}
