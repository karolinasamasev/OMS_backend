package com.kn.ordermanagementsystem.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod-gen")
    @SequenceGenerator(name = "prod-gen")
    private Long id;

    private String name;
    private String skuCode;
    private BigDecimal unitPrice;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private Set<OrderLine> orderLines;

    public Product(String name, String skuCode, BigDecimal unitPrice) {
        this.name = name;
        this.skuCode = skuCode;
        this.unitPrice = unitPrice;
        this.orderLines = new HashSet<>();
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skuCode='" + skuCode + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
