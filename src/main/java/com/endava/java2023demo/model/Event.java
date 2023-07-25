package com.endava.java2023demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Event")
public class Event {
    @Column(name = "eventID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venue;
    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;
    @Column(name = "eventDescription")
    private String description;
    @Column(name = "eventName")
    private String name;
    @Column(name = "startDate")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime startDate;
    @Column(name = "endDate")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime endDate;

    public Event() {
    }

    public Event(Venue venue, EventType eventType, String eventDescription,
                 String eventName, LocalDateTime startDate, LocalDateTime endDate) {
        this.venue = venue;
        this.eventType = eventType;
        this.description = eventDescription;
        this.name = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setEventID(Integer eventID) {
        this.id = eventID;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void setEventDescription(String eventDescription) {
        this.description = eventDescription;
    }

    public void setEventName(String eventName) {
        this.name = eventName;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getEventID() {
        return id;
    }

    public Venue getVenue() {
        return venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public String getEventDescription() {
        return description;
    }

    public String getEventName() {
        return name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Event{" + "eventID=" + id +
                ", venueID=" + venue + ", eventTypeID='" + eventType +
                ", eventDescription" + description +
                ", eventName" + name + ", startDate" + startDate + ", endDate" + endDate + '}';
    }
}