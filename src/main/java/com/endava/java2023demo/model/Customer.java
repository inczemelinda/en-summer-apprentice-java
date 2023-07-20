package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerID;
    @Column
    private String customerName;
    @Column
    private String email;

    public Customer() {
        // Default constructor
    }

    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID +
                ", customerName=" + customerName + ", email='" + email + '}';
    }
}