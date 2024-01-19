package mavenWeeklyProject;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ProjectMain {
    public static void main(String[] args) {

        Scanner         scanner = new Scanner(System.in);
        LibraryCatalog  catalog = new LibraryCatalog();

        Book book1 = new Book("Test", 2002, 161, "Author", "Genre");
        Book book2 = new Book("LOTR", 2000, 127, "AuthorLOTR", "Fantasy");
        Book book3 = new Book("LOTR", 1970, 300, "Author", "Fantasy");
        Book book4 = new Book("LOTR", 2000, 583, "AuthorLOTR", "Fantasy");
        Book book5 = new Book("LOTR", 2000, 200, "AuthorLOTR", "Fantasy");



        System.out.println(book1.toString());

        book1.setIsbn(8421992148251l);

        catalog.addItem(book1);
        catalog.addItem(book2);

        System.out.println();

        catalog.searchByIsbn(8421992148251l);

        System.out.println(catalog.searchByPublicationYear(2000));
        System.out.println(catalog.searchByAuthor("AuthorLOTR"));






    }


}
