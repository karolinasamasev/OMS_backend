package com.kn.ordermanagementsystem.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ord-gen")
    @SequenceGenerator(name = "ord-gen")
    private Long id;


    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OrderLine> setOfOrderLines;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;


    private LocalDate dateOfSubmission;

    public Order(Set<OrderLine> setOfOrderLines, Customer customer, LocalDate dateOfSubmission) {
        this.setOfOrderLines = setOfOrderLines;
        this.customer = customer;
        this.dateOfSubmission = dateOfSubmission;
    }

    public Order() {
    }

    public Set<OrderLine> getSetOfOrderLines() {
        return setOfOrderLines;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDateOfSubmission() {
        return dateOfSubmission;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", setOfOrderLines=" + setOfOrderLines +
                ", customer=" + customer +
                ", dateOfSubmission=" + dateOfSubmission +
                '}';
    }
}
