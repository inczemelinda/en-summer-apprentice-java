package com.endava.java2023demo.controller;

import com.endava.java2023demo.model.Event;
import com.endava.java2023demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    // Endpoint for GET /events?venueId=1234&eventType=SPORTS
    @GetMapping
    public List<Event> getEventsByVenueIdAndEventType(
            @RequestParam(name = "venueID") Integer venueID,
            @RequestParam(name = "eventType") String eventType) {
        return eventService.getEventsByVenueIdAndEventType(venueID, eventType);
    }
}
