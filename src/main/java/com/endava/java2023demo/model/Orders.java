package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;
    @Column
    private String orderedAt;
    @Column
    private int numberOfTickets;
    @Column
    private double totalPrice;

    public Orders() {
        // Default constructor
    }

    public Orders(Customer customer, TicketCategory ticketCategory, String orderedAt,
                  int numberOfTickets, double totalPrice) {
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public void setOrderedAt(String orderedAt) {
        this.orderedAt = orderedAt;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public String getOrderedAt() {
        return orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Orders{" + "orderID=" + orderID +
                ", customerID=" + customer + ", ticketCategoryID='" + ticketCategory +
                ", ordoredAt" + orderedAt + ", numberOfTickets" + numberOfTickets + ", totalPrice" + totalPrice + '}';
    }
}