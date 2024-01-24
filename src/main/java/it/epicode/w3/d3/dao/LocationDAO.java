package it.epicode.w3.d3.dao;

import it.epicode.w3.d3.entities.Event;
import it.epicode.w3.d3.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LocationDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public LocationDAO(){
        emf = Persistence.createEntityManagerFactory("eventmanagement");
        em  = emf.createEntityManager();
    }
    public Location createLocation(Location location) {
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(location);
        et.commit();
        em.refresh(location);

        return location;
    }

    public Location getById(int id) {
        return em.find(Location.class, id);
    }

    public void deleteLocation(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Location location = getById(id);
        em.remove(location);
        et.commit();
    }

}
