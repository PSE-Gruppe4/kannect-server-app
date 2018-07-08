package com.pse.testserver.repository;

import com.pse.testserver.entities.Category;
import com.pse.testserver.entities.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Advanced repository interface which includes find methods related to event entity.
 *
 */
public interface EventRepositoryAdvanced{
    
    /**
     * Find all events from the database by date.
     *
     * @param date date of searched events
     * @return events with the specified date
     */
    @Query("Select * from events e where e.date like date")
    List<Event> findAllByDate(@Param("date") Date date);

    /**
     * Find all events from the database containing the string name sorted by date.
     *
     * @param name word to be searched in all events names
     * @return list of all events containing the string name at the given date
     */
    @Query("Select * from events e where e.name like name")
    List<Event> findByNameSortedByDate(@Param("name") String name);

    /**
     * Find all events from the database containing the string name sorted by category.
     *
     * @param name word to be searched in all events names.
     * @param category category of searched events
     * @return list of all events containing the string name with the specified category
     */
    @Query("Select * from events e where e.name like name and e.category_id like category")
    List<Event> findAllByNameSortedByCategory(@Param("name") String name, @Param("category") long category);


    /**
     * Find all events from the database sorted by Date
     * @return list of events, chronologically sorted with the latest event being the first element.
     */
    @Query("Select * from events ORDER BY date DESC")
    List<Event> findAllSortedByDate();
}
