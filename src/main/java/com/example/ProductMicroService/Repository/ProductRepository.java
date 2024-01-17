package com.example.ProductMicroService.Repository;

import com.example.ProductMicroService.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
