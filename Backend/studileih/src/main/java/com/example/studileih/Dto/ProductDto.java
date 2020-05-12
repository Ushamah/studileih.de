package com.example.studileih.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public abstract class ProductDto {
    private Long id;
    private Long userId;
    private String name;
    private String title;
    private double price = 0;
    private int views = 0; //How often was the product viewed?
    private boolean available = true; //is it available?
    private String createdAt;
    private String updatedAt;
    private ArrayList<String> picPaths;
}
