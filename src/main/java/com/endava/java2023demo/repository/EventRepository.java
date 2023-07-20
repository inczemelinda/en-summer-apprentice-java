package com.endava.java2023demo.repository;

import com.endava.java2023demo.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
    List<Event> findByVenueIdAndEventTypeEventTypeName(Integer venueID, String eventType);
}
