package com.example.ProductMicroService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String productName;
    private String Category;
    private Double price;

    public Product()
    {

    }
    public Product(int ID, String productName, String category, Double price) {
        this.ID = ID;
        this.productName = productName;
        Category = category;
        this.price = price;
    }
}
