package com.endava.java2023demo.DTO;

public class orderRequest {

    private Integer eventID;
    private Integer ticketCategoryID;
    private Integer numberOfTickets;

    public orderRequest() {
    }

    public orderRequest(Integer eventID, Integer ticketCategoryID, Integer numberOfTickets) {
        this.eventID = eventID;
        this.ticketCategoryID = ticketCategoryID;
        this.numberOfTickets = numberOfTickets;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}