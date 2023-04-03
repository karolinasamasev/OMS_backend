package com.kn.ordermanagementsystem.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cus-gen")
    @SequenceGenerator(name = "cus-gen")
    private Long id;

    private String registrationCode;
    private String fullName;
    private String email;
    private String telephone;


    @OneToMany(mappedBy = "customer")
    private Set<Order> orders;

    public Customer(String registrationCode, String fullName, String email, String telephone) {
        this.registrationCode = registrationCode;
        this.fullName = fullName;
        this.email = email;
        this.telephone = telephone;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", registrationCode='" + registrationCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
