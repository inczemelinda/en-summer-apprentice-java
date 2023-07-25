package com.endava.java2023demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Orders")
public class Orders {
    @Column(name = "orderID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;
    @Column(name = "orderedAt")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime orderedAt;
    @Column(name = "numberOfTickets")
    private Integer numberOfTickets;
    @Column(name = "totalPrice" , columnDefinition = "NUMERIC(10,2)")
    private double totalPrice;

    public Orders() {
    }

    public Orders(Customer customer, TicketCategory ticketCategory, LocalDateTime orderedAt,
                  Integer numberOfTickets, double totalPrice) {
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Orders{" + "orderID=" + id +
                ", customerID=" + customer + ", ticketCategoryID='" + ticketCategory +
                ", orderedAt" + orderedAt + ", numberOfTickets" + numberOfTickets + ", totalPrice" + totalPrice + '}';
    }
}