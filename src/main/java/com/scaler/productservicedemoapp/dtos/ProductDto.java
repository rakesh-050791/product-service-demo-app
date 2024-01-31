package com.scaler.productservicedemoapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private double price;
    private String description;
    private String imageUrl;
    private Long categoryId;
    private String categoryName;
}
