package it.epicode.w3.d3.dao;

import it.epicode.w3.d3.entities.Location;
import it.epicode.w3.d3.entities.Partecipation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PartecipationDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PartecipationDAO(){
        emf = Persistence.createEntityManagerFactory("eventmanagement");
        em  = emf.createEntityManager();
    }
    public Partecipation createPartecipation(Partecipation partecipation) {
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(partecipation);
        et.commit();
        em.refresh(partecipation);

        return partecipation;
    }

    public Partecipation getById(int id) {
        return em.find(Partecipation.class, id);
    }

    public void deletePartecipation(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Partecipation partecipation = getById(id);
        em.remove(partecipation);
        et.commit();
    }
}
