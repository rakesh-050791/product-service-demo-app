package com.scaler.productservicedemoapp.services;

import com.scaler.productservicedemoapp.dtos.ProductDto;
import com.scaler.productservicedemoapp.models.Category;
import com.scaler.productservicedemoapp.models.Product;
import com.scaler.productservicedemoapp.repositories.CategoryRepository;
import com.scaler.productservicedemoapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("SelfProductService")
public class SelfProductService implements ProductService{

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public SelfProductService(ProductRepository productRepository,
                              CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // New method for DTO conversion
    public List<ProductDto> getAllProductsDTO() {
        List<Product> products = this.getAllProducts();
        return products.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private ProductDto convertToDTO(Product product) {
        ProductDto dto = new ProductDto();
        // populate dto fields from product
        return dto;
    }

    @Override
    public Product addNewProduct(Product product){// In Class
        Optional<Category> categoryOptional = categoryRepository.findByName(product.getCategory().getName());

        if (categoryOptional.isEmpty()) {

        } else {
            product.setCategory(categoryOptional.get());
        }

        return productRepository.save(product);
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }
}
