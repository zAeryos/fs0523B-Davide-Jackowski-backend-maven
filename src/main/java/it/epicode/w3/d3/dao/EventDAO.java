package it.epicode.w3.d3.dao;

import it.epicode.w3.d3.entities.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EventDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public EventDAO(){
        emf = Persistence.createEntityManagerFactory("eventmanagement");
        em  = emf.createEntityManager();
    }
    public Event createEvent(Event event) {
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(event);
        et.commit();
        em.refresh(event);

        return event;
    }

    public Event getById(int id) {
        return em.find(Event.class, id);
    }

    public void deleteEvent(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Event event = getById(id);
        em.remove(event);
        et.commit();
    }

}
