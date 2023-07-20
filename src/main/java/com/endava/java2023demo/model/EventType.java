package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "EventType")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventTypeID;
    @Column
    private String eventTypeName;

    public EventType() {
        // Default constructor
    }

    public EventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public void setEventTypeID(Integer eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public Integer getEventTypeID() {
        return eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    @Override
    public String toString() {
        return "EventType{" + "eventTypeID=" + eventTypeID +
                ", eventTypeName=" + eventTypeName + '}';
    }
}