package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventID;
    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venue;
    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;
    @Column
    private String eventDescription;
    @Column
    private String eventName;
    @Column
    private String startDate;
    @Column
    private String endDate;

    public Event() {
        // Default constructor
    }

    public Event(Venue venue, EventType eventType, String eventDescription,
                 String eventName, String startDate, String endDate) {
        this.venue = venue;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getEventID() {
        return eventID;
    }

    public Venue getVenue() {
        return venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Event{" + "eventID=" + eventID +
                ", venueID=" + venue + ", eventTypeID='" + eventType +
                ", eventDescription" + eventDescription +
                ", eventName" + eventName + ", startDate" + startDate + ", endDate" + endDate + '}';
    }
}