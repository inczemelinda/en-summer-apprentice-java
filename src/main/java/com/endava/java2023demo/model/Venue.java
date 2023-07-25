package com.endava.java2023demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Venue")
public class Venue {
    @Column(name = "venueID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "location")
    private String location;
    @Column(name = "type")
    private String type;
    @Column(name = "capacity")
    private int capacity;

    public Venue() {
    }

    public Venue(String location, String type, int capacity) {
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }

    public void setVenueID(Integer venueID) {
        this.id = venueID;
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
        return id;
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
        return "Venue{" + "venueID=" + id +
                ", location=" + location + ", type='" + type +
                ", capacity" + capacity + '}';
    }
}