package com.kn.ordermanagementsystem.repository;

import com.kn.ordermanagementsystem.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
}
