package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
    @Column(name = "customerID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "email")
    private String email;

    public Customer() {
    }

    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }

    public void setCustomerId(Integer id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCustomerId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + id +
                ", customerName=" + customerName + ", email='" + email + '}';
    }
}