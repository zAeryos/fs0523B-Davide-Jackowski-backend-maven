package it.epicode.w3.d3.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "eventmanagement")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title", nullable = false)

    private String title;
    @Column(name = "event_date", nullable = false)

    private LocalDate eventDate;
    private String description;
    @Column(name = "event_type", nullable = false)

    private EventType eventType;
    @Column(name = "max_participants")
    private int maxParticipants;
    @ManyToOne
    @JoinColumn(name = "location_fk")
    private Location location;
    @OneToMany(mappedBy = "event")
    private List<Partecipation> partecipations;

    public Event(String title, LocalDate eventDate, String description, EventType eventType, int maxParticipants, Location location, List<Partecipation> partecipations) {
        this.title = title;
        this.eventDate = eventDate;
        this.description = description;
        this.eventType = eventType;
        this.maxParticipants = maxParticipants;
        this.location = location;
        this.partecipations = partecipations;
    }

    public Event() {
    }

    public List<Partecipation> getPartecipations() {
        return partecipations;
    }

    public void setPartecipations(List<Partecipation> partecipations) {
        this.partecipations = partecipations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "EventManagement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDate=" + eventDate +
                ", description='" + description + '\'' +
                ", eventType=" + eventType +
                ", maxParticipants=" + maxParticipants +
                '}';
    }
}
