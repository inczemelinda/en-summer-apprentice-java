package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer venueID;
    @Column
    private String location;
    @Column
    private String type;
    @Column
    private int capacity;

    public Venue() {
        // Default constructor
    }

    public Venue(String location, String type, int capacity) {
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }

    public void setVenueID(Integer venueID) {
        this.venueID = venueID;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Integer getVenueID() {
        return venueID;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Venue{" + "venueID=" + venueID +
                ", location=" + location + ", type='" + type +
                ", capacity" + capacity + '}';
    }
}