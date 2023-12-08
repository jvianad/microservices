package com.myprojects.products_service.repository;

import com.myprojects.products_service.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iProductRepository extends JpaRepository<Product,Long> {
}
