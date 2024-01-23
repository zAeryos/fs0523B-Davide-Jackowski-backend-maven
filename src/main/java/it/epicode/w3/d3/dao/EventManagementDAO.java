package it.epicode.w3.d3.dao;

import it.epicode.w3.d3.entities.EventManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EventManagementDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public EventManagementDAO(){
        emf = Persistence.createEntityManagerFactory("eventmanagement");
        em  = emf.createEntityManager();
    }
    public EventManagement createEvent(EventManagement eventManagement) {
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(eventManagement);
        et.commit();
        em.refresh(eventManagement);

        return eventManagement;
    }

    public EventManagement getById(int id) {
        return em.find(EventManagement.class, id);
    }

    public void deleteEvent(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        EventManagement eventManagement = getById(id);
        em.remove(eventManagement);
        et.commit();
    }

}
