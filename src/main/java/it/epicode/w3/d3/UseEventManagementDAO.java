package it.epicode.w3.d3;

import it.epicode.w3.d3.dao.EventManagementDAO;
import it.epicode.w3.d3.entities.EventManagement;
import it.epicode.w3.d3.entities.EventType;

import java.time.LocalDate;

public class UseEventManagementDAO {

    public static void main(String[] args) {

        EventManagementDAO  dao             = new EventManagementDAO();
        EventManagement     eventManagement = new EventManagement();

        eventManagement.setTitle("Fabio's show");
        eventManagement.setDescription("Fabio will show the world stuff");
        eventManagement.setEventType(EventType.PERFORMANCE);
        eventManagement.setEventDate(LocalDate.of(2024, 02, 7));
        eventManagement.setMaxParticipants(250);

        dao.createEvent(eventManagement);
        System.out.println(eventManagement);

        EventManagement event2 = dao.getById(2);
        System.out.println(event2);

//        dao.deleteEvent(1);

    }
}