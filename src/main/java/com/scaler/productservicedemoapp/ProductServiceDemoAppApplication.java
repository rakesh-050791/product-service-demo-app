package com.scaler.productservicedemoapp;

import com.scaler.productservicedemoapp.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceDemoAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProductServiceDemoAppApplication.class, args);

//        Product product = new Product();
//        product.getId();
//        product.setId(0L);
    }

}
