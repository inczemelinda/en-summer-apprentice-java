package com.endava.java2023demo.DTO;

import java.time.LocalDateTime;

public class OrdersDTO {
    private Integer ticketCategoryID;
    private Integer eventID;
    private LocalDateTime orderedAt;
    private Integer numberOfTickets;
    private double totalPrice;

    public OrdersDTO() {
    }

    public OrdersDTO(Integer ticketCategoryID,
                     Integer eventID, LocalDateTime orderedAt, Integer numberOfTickets, double totalPrice) {
        this.ticketCategoryID = ticketCategoryID;
        this.eventID = eventID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}