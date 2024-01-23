//package it.epicode.w3.d2.entities;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "person")
//public class Person {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//    private String name;
//    private String surname;
//    @Column(name = "birthday", nullable = false)
//    private LocalDate birthday;
//    @Column(name = "profession", nullable = false)
//    private Profession profession;
//
//    public Person(int id, String name, String surname, LocalDate birthday, Profession profession) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.birthday = birthday;
//        this.profession = profession;
//    }
//
//    public Person() {
//
//    }
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(LocalDate birthday) {
//        this.birthday = birthday;
//    }
//
//    public Profession getProfession() {
//        return profession;
//    }
//
//    public void setProfession(Profession profession) {
//        this.profession = profession;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", birthday=" + birthday +
//                ", profession=" + profession +
//                '}';
//    }
//}
