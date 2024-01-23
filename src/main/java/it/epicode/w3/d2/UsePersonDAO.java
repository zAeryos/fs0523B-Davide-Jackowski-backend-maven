//package it.epicode.w3.d2;
//
//import it.epicode.w3.d2.dao.PersonDAO;
//import it.epicode.w3.d2.entities.Person;
//import it.epicode.w3.d2.entities.Profession;
//
//import java.time.LocalDate;
//
//public class UsePersonDAO {
//
//    public static void main(String[] args) {
//        PersonDAO dao = new PersonDAO();
//
//        Person person = new Person();
//        person.setName("John");
//        person.setSurname("Smith");
//        person.setProfession(Profession.PROGRAMMER);
//        person.setBirthday(LocalDate.of(1999, 9, 14));
//
//        dao.addPerson(person);
//        System.out.println(person);
//
//        Person person2 = dao.getById(1);
//        System.out.println(person2);
//
//        dao.deletePerson(2);
//    }
//}
