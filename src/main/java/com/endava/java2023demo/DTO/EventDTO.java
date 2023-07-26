package com.endava.java2023demo.DTO;

import java.time.LocalDateTime;

public class EventDTO {
    private Integer eventID;
    private Integer venueID;
    private Integer eventTypeID;
    private String description;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public EventDTO() {

    }

    public EventDTO(Integer eventID, Integer venueID, Integer eventTypeID, String description,
                    String eventName, LocalDateTime startDate, LocalDateTime endDate) {
        this.eventID = eventID;
        this.venueID = venueID;
        this.eventTypeID = eventTypeID;
        this.description = description;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Integer getVenueID() {
        return venueID;
    }

    public void setVenueID(Integer venueID) {
        this.venueID = venueID;
    }

    public Integer getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(Integer eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}