package com.kn.ordermanagementsystem.service;

import com.kn.ordermanagementsystem.model.Product;
import com.kn.ordermanagementsystem.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product storeProduct(Product product) {
        return productRepository.save(product);
    }
}
