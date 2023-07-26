package com.endava.java2023demo.DTO;

public class EventTypeDTO {
    private Integer eventTypeID;
    private String eventTypeName;

    public EventTypeDTO() {

    }

    public EventTypeDTO(Integer eventTypeID, String eventTypeName) {
        this.eventTypeID = eventTypeID;
        this.eventTypeName = eventTypeName;
    }

    public Integer getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(Integer eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}