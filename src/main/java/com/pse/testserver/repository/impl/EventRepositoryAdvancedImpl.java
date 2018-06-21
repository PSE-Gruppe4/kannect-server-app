package com.pse.testserver.repository.impl;

import com.pse.testserver.entities.Category;
import com.pse.testserver.entities.Event;
import com.pse.testserver.entities.User;
import com.pse.testserver.repository.EventRepositoryAdvanced;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class EventRepositoryAdvancedImpl.
 */
@Repository
public class EventRepositoryAdvancedImpl implements EventRepositoryAdvanced {

    /** The entity manager. */
    @Autowired
    private EntityManager entityManager;

    /* (non-Javadoc)
     * @see com.pse.testserver.repository.EventRepositoryAdvanced#findAllByDate(java.util.Date)
     */
    @Override
    public List<Event> findAllByDate(Date date) {
        return null;
    }

    /**
     * Find by nme sorted by date.
     *
     * @param name the name
     * @param date the date
     * @return the list
     */
    @Override
    public List<Event> findByNmeSortedByDate(String name, Date date) {
        return null;
    }

    /* (non-Javadoc)
     * @see com.pse.testserver.repository.EventRepositoryAdvanced#findParticipatedUsers(com.pse.testserver.entities.Event)
     */
    @Override
    public List<User> findParticipatedUsers(Event event) {
        return null;
    }

    /**
     * Find all sorted by date.
     *
     * @param name the name
     * @param date the date
     * @return the list
     */
    public List<Event> findAllSortedByDate(String name, Date date) {
        return null;
    }

    /* (non-Javadoc)
     * @see com.pse.testserver.repository.EventRepositoryAdvanced#findAllByNameSortedByCategory(java.lang.String, com.pse.testserver.entities.Category)
     */
    public List<Event> findAllByNameSortedByCategory(String name, Category category) {
        return null;
    }

    /**
     * Find all by name.
     *
     * @param name the name
     * @return the list
     */
    public List<Event> findAllByName(String name) {
        return null;
    }
}
