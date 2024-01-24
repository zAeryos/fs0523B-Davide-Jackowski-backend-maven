package it.epicode.w3.d3.dao;

import it.epicode.w3.d3.entities.Partecipation;
import it.epicode.w3.d3.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonDAO(){
        emf = Persistence.createEntityManagerFactory("eventmanagement");
        em  = emf.createEntityManager();
    }
    public Person createPartecipation(Person person) {
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(person);
        et.commit();
        em.refresh(person);

        return person;
    }

    public Person getById(int id) {
        return em.find(Person.class, id);
    }

    public void deletePerson(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Person person = getById(id);
        em.remove(person);
        et.commit();
    }

}
