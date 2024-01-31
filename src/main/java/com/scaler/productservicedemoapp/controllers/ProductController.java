package com.scaler.productservicedemoapp.controllers;

import com.scaler.productservicedemoapp.dtos.ProductDto;
import com.scaler.productservicedemoapp.models.Product;
import com.scaler.productservicedemoapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products") //localhost:8080/products/
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(@Qualifier("SelfProductService") ProductService productService){
        this.productService = productService;
    }

//    @Autowired
//    public ProductController(@Qualifier("FakeStoreProductService") ProductService productService){
//        this.productService = productService;
//    }

    @GetMapping("/")
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        List<ProductDto> productDTOs = productService.getAllProductsDTO();
        return ResponseEntity.status(HttpStatus.OK).body(productDTOs);
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        throw new RuntimeException("Something went wrong");
//        return productService.getSingleProduct(id);
    }

    @PostMapping("/")
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product){
        Product newProduct = productService.addNewProduct(product);
        return ResponseEntity.status(HttpStatus.OK).body(newProduct);
    }

    @PatchMapping("/{id}")
    public Product updateAProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return productService.replaceProduct(id, product);
    }

    @PutMapping("/{id}")
    public Product replaceAProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return new Product();
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deleteAProduct(@PathVariable("id") Long id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
