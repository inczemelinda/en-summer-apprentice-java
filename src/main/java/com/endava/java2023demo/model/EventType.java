package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "EventType")
public class EventType {
    @Column(name = "eventTypeID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "eventTypeName")
    private String name;

    public EventType() {
    }

    public EventType(String eventTypeName) {
        this.name = eventTypeName;
    }

    public void setEventTypeID(Integer eventTypeID) {
        this.id = eventTypeID;
    }

    public void setEventTypeName(String eventTypeName) {
        this.name = eventTypeName;
    }

    public Integer getEventTypeID() {
        return id;
    }

    public String getEventTypeName() {
        return name;
    }

    @Override
    public String toString() {
        return "EventType{" + "eventTypeID=" + id +
                ", eventTypeName=" + name + '}';
    }
}