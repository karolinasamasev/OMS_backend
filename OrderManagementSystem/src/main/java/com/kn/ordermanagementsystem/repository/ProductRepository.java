package com.kn.ordermanagementsystem.repository;

import com.kn.ordermanagementsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
