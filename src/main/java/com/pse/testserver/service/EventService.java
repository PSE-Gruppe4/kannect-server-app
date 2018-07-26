package com.pse.testserver.service;

import com.pse.testserver.dto.EventDTO;
import com.pse.testserver.entities.Event;
import com.pse.testserver.repository.EventRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class implementing the business logic regarding the event entity, which includes (or may include
 * in future versions) searching, creating, modifying, deleting and other operations which the application needs
 * to perform on mainly event objects.
 * To perform these operations, methods of the injected repository class(es) are to be used.
 */
@Service
public class EventService {

    /**
     * Injected EventRepository class dependency.
     */
    @Autowired
    private EventRepository eventRepository;


    @Autowired
    ModelMapper modelMapper;


    /**
     * Looks for events, which take place on the given date
     * @param date to look for events.
     * @return list of wanted events.
     */
    @Transactional
    public List<EventDTO> getAllByDate(Date date) {
        return eventRepository.findAllByDate(date).stream().map(event -> toDTO(event)).collect(Collectors.toList());
    }

    /**
     * Looks for events, which include the given String in their names.
     * @param name to look for events.
     * @return list of wanted events chronologically sorted with the latest event being the first element.
     */
    @Transactional
    public List<EventDTO> getByNameSortedByDate(String name) {
        return eventRepository.findByNameSortedByDate(name).stream().map(event -> toDTO(event)).collect(Collectors.toList());
    }

    /**
     * Saves an event to the system.
     * @param event to be saved.
     */
    @Transactional
    public void createEvent(Event event) {
        eventRepository.save(event);
    }

    /**
     * Deletes an event from the system.
     * @param event to be deleted.
     */
    @Transactional
    public void deleteEvent(Event event) {
        eventRepository.delete(event);
    }

    /**
     * Edits an event by saving the editedEvent received from the client.
     * @param editedEvent received from the client, has the edited attributes.
     */
    @Transactional
    public void editEvent(Event editedEvent) {
        eventRepository.save(editedEvent);
    }

    private EventDTO toDTO(Event event) {
        return modelMapper.map(event, EventDTO.class);
    }
}
