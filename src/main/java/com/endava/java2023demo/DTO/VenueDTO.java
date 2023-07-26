package com.endava.java2023demo.DTO;

public class VenueDTO {

    private Integer venueID;
    private String location;
    private String type;
    private int capacity;

    public VenueDTO() {
    }

    public VenueDTO(Integer venueID, String location, String type, int capacity) {
        this.venueID = venueID;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }

    public Integer getVenueID() {
        return venueID;
    }

    public void setVenueID(Integer venueID) {
        this.venueID = venueID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}