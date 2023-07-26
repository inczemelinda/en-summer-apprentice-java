package com.endava.java2023demo.DTO;

import com.endava.java2023demo.model.Event;

public class TicketCategoryDTO {

    private Integer ticketCategoryID;
    private Integer eventID;
    private String description;
    private double price;

    public TicketCategoryDTO() {
    }

    public TicketCategoryDTO(Integer ticketCategoryID, Integer eventID, String description, double price) {
        this.ticketCategoryID = ticketCategoryID;
        this.eventID = eventID;
        this.description = description;
        this.price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}