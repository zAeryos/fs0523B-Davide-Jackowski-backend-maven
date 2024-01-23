//package it.epicode.w3.d2.dao;
//
//
//import it.epicode.w3.d2.entities.Person;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class PersonDAO {
//    private EntityManagerFactory emf;
//    private EntityManager em;
//
//    public PersonDAO(){
//        emf = Persistence.createEntityManagerFactory("epicodejpa");
//        em  = emf.createEntityManager();
//    }
//
//    public Person addPerson(Person person) {
//        EntityTransaction et = em.getTransaction();
//
//        et.begin();
//        em.persist(person);
//        et.commit();
//        em.refresh(person);
//
//        return person;
//    }
//
//    public Person getById(int id) {
//        return em.find(Person.class, id);
//    }
//
//    public void deletePerson(int id) {
//        EntityTransaction et = em.getTransaction();
//        et.begin();
//        Person person = getById(id);
//        em.remove(person);
//        et.commit();
//    }
//}
