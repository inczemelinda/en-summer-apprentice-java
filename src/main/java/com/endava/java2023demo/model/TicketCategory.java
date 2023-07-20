package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketCategoryID;
    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;
    @Column
    private String description;
    @Column
    private double price;

    public TicketCategory() {
        // Default constructor
    }

    public TicketCategory(Event event, String description, double price) {
        this.event = event;
        this.description = description;
        this.price = price;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public Event getEvent() {
        return event;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TicketCategory{" + "ticketCategoryID=" + ticketCategoryID +
                ", eventID=" + event + ", description='" + description +
                ", price" + price + '}';
    }
}