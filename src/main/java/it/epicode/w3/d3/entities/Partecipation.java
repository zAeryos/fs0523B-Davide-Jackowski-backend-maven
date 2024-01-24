package it.epicode.w3.d3.entities;

import javax.persistence.*;

@Entity
@Table(name = "partecipation")
public class Partecipation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "person_fk")
    private Person person;
    @ManyToOne
    @JoinColumn(name = "event_fk")
    private Event event;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Partecipation() {
    }

    public Partecipation(Person person, Event event, Status status) {
        this.person = person;
        this.event = event;
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
