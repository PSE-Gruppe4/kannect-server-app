package com.pse.testserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.pse.testserver.entities.Event;
import com.pse.testserver.entities.User;
import com.pse.testserver.service.EventService;

public class EventController {
    
    @Autowired
    EventService eventService;
    
    @GetMapping("/events")
    public List<Event> getEvents(@RequestParam(value = "name", defaultValue = "") String name) {
        //eventService.getEventsByName(name) ...
        return null;
    }
    

}
