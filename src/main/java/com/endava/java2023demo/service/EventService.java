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

    public List<Event> getEventsByVenue_IdAndType_Name(Integer id, String name) {
        return eventRepository.findEventsByVenueIdAndEventTypeName(id, name);
    }
}