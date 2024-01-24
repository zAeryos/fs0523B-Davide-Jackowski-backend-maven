package it.epicode.w3.d3;

import it.epicode.w3.d3.dao.EventDAO;
import it.epicode.w3.d3.entities.Event;
import it.epicode.w3.d3.entities.EventType;

import java.time.LocalDate;

public class UseEventDAO {

    public static void main(String[] args) {

        EventDAO dao             = new EventDAO();
        Event event = new Event();

        event.setTitle("Fabio's show");
        event.setDescription("Fabio will show the world stuff");
        event.setEventType(EventType.PERFORMANCE);
        event.setEventDate(LocalDate.of(2024, 02, 7));
        event.setMaxParticipants(250);

        dao.createEvent(event);
        System.out.println(event);

        Event event2 = dao.getById(2);
        System.out.println(event2);

        dao.deleteEvent(6);

    }
}