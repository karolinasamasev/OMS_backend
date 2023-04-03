package com.kn.ordermanagementsystem.controller;

import com.kn.ordermanagementsystem.model.Customer;
import com.kn.ordermanagementsystem.model.Order;
import com.kn.ordermanagementsystem.model.Product;
import com.kn.ordermanagementsystem.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

    @PutMapping ({"{orderID}/orderlines/{orderLineID}"})
    public ResponseEntity<List<Order>> updateOrderLineQuantity(
            @PathVariable(name = "orderID") Long orderID,
            @PathVariable(name = "orderLineID") Long orderLineID,
            @RequestParam(name = "quantity") int quantity) {
        orderService.updateQuantity(orderID, orderLineID, quantity);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/bydate")
    public ResponseEntity<List<Order>> getOrder(@RequestParam(name = "date") LocalDate date) {
        List<Order> getOrder = orderService.getOrder(date);
        return ResponseEntity.status(HttpStatus.OK).body(getOrder);
    }

    @GetMapping("/byproduct")
    public ResponseEntity<List<Order>> getOrder(@RequestBody Product product) {
        List<Order> getOrder = orderService.getOrder(product);
        return ResponseEntity.status(HttpStatus.OK).body(getOrder);
    }

    @GetMapping("/bycustomer")
    public ResponseEntity<List<Order>> getOrder(@RequestBody Customer customer) {
        List<Order> getOrder = orderService.getOrder(customer);
        return ResponseEntity.status(HttpStatus.OK).body(getOrder);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrder() {
        List<Order> getOrder = orderService.getOrder();
        return ResponseEntity.ok(getOrder);
    }
}
