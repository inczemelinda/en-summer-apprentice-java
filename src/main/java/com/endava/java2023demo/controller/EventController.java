package com.endava.java2023demo.controller;

import com.endava.java2023demo.model.Event;
import com.endava.java2023demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;
    @GetMapping("/api/events")
    public List<Event> getEvents(@RequestParam Integer id, @RequestParam String name) {
        List<Event> events = eventService.getEventsByVenue_IdAndType_Name(id, name);
        return events;
    }
}