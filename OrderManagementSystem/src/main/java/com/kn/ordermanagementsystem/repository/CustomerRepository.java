package com.kn.ordermanagementsystem.repository;

import com.kn.ordermanagementsystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
