package com.endava.java2023demo.service;

import com.endava.java2023demo.model.Event;
import com.endava.java2023demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    // Method to get events by venueID and eventType
    public List<Event> getEventsByVenueIdAndEventType(Integer venueID, String eventType) {
        return eventRepository.findByVenueIdAndEventTypeEventTypeName(venueID, eventType);
    }
}