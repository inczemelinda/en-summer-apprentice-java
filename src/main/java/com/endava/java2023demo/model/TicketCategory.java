package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory {
    @Column(name = "ticketCategoryID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;
    @Column(name = "description")
    private String description;
    @Column(name = "price", columnDefinition = "NUMERIC(10,2)")
    private double price;

    public TicketCategory() {
    }

    public TicketCategory(Event event, String description, double price) {
        this.event = event;
        this.description = description;
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getId() {
        return id;
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
        return "TicketCategory{" + "ticketCategoryID=" + id +
                ", eventID=" + event + ", description='" + description +
                ", price" + price + '}';
    }
}