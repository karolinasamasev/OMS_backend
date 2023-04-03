package com.kn.ordermanagementsystem.repository;

import com.kn.ordermanagementsystem.model.Order;
import com.kn.ordermanagementsystem.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByDateOfSubmission(LocalDate dateOfSubmission);

    @Query("SELECT o FROM Order o JOIN OrderLine ol ON o.id=ol.order.id WHERE ol.product.id=?1")
    List<Order> findAllByProduct(Long id);

    @Query("SELECT o FROM Order o WHERE o.customer.id=?1")
    List<Order> findAllByCustomer(Long id);

    @Query("SELECT ol FROM OrderLine ol WHERE ol.order.id=?1 AND ol.id=?2")
    Optional<OrderLine> findOrderLineByID(Long orderID, Long orderLineID);
}
