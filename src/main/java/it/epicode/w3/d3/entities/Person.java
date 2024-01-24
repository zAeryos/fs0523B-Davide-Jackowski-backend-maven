package it.epicode.w3.d3.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @OneToMany(mappedBy = "person")
    @OrderBy()
    private List<Partecipation> partecipations;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Partecipation> getPartecipations() {
        return partecipations;
    }

    public void setPartecipations(List<Partecipation> partecipations) {
        this.partecipations = partecipations;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", sex=" + sex +
                ", partecipations=" + partecipations +
                '}';
    }
}
