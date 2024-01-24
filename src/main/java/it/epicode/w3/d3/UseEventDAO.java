package it.epicode.w3.d3;

import it.epicode.w3.d3.dao.EventDAO;
import it.epicode.w3.d3.dao.LocationDAO;
import it.epicode.w3.d3.dao.PartecipationDAO;
import it.epicode.w3.d3.dao.PersonDAO;
import it.epicode.w3.d3.entities.Event;
import it.epicode.w3.d3.entities.EventType;
import it.epicode.w3.d3.entities.Partecipation;

import java.time.LocalDate;

public class UseEventDAO {

    public static void main(String[] args) {

        PartecipationDAO    partecipationDAO    = new PartecipationDAO();
        PersonDAO           personDAO           = new PersonDAO();
        LocationDAO         locationDAO         = new LocationDAO();
        EventDAO            eventDAO            = new EventDAO();



        Event event = new Event();
        event.setTitle("Fabio's show");
        event.setDescription("Fabio will show the world stuff");
        event.setEventType(EventType.PERFORMANCE);
        event.setEventDate(LocalDate.of(2024, 02, 7));
        event.setMaxParticipants(250);

    }
}