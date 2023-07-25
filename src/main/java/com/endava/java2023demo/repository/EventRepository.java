package com.endava.java2023demo.repository;

import com.endava.java2023demo.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findEventsByVenueIdAndEventTypeName(Integer id, String name);
    List<Event> findAll();
}