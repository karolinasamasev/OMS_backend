
package com.kn.ordermanagementsystem.service;

import com.kn.ordermanagementsystem.model.Customer;
import com.kn.ordermanagementsystem.model.Order;
import com.kn.ordermanagementsystem.model.OrderLine;
import com.kn.ordermanagementsystem.model.Product;
import com.kn.ordermanagementsystem.repository.OrderLineRepository;
import com.kn.ordermanagementsystem.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderLineRepository orderLineRepository;

    public OrderService(OrderRepository orderRepository, OrderLineRepository orderLineRepository) {
        this.orderRepository = orderRepository;
        this.orderLineRepository = orderLineRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getOrder(LocalDate date) {
        return orderRepository.findAllByDateOfSubmission(date);
    }

    public List<Order> getOrder(Product product) {
        return orderRepository.findAllByProduct(product.getId());
    }

    public List<Order> getOrder(Customer customer) {
        return orderRepository.findAllByCustomer(customer.getId());
    }

    public List<Order> getOrder() {
        return orderRepository.findAll();
    }

    public void updateQuantity(Long orderID, Long orderLineID, int quantity) {
        Optional<OrderLine> orderLineByID = orderRepository.findOrderLineByID(orderID, orderLineID);
        if (orderLineByID.isPresent()) {
            OrderLine orderLine = orderLineByID.get();
            orderLine.setQuantity(quantity);
            orderLineRepository.save(orderLine);
        }
    }
}
