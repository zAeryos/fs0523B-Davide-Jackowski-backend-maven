package mavenWeeklyProject;

import java.time.LocalDate;


public class Book extends Catalog{
    private String author;
    private String genre;

    public Book(String title, int publicationYear, int pageCount, String author, String genre) {
        super(title, publicationYear, pageCount);
        this.author = author;
        this.genre  = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "  title='"             + getTitle() + '\'' +
                ", publicationYear='"   + getPublicationYear() + '\'' +
                ", pageCount='"         + getPageCount() + '\'' +
                ", author='"            + author + '\'' +
                ", genre='"             + genre + '\'' +
                ", ISBN='"              + getIsbn() + '\'' +
                '}';
    }
}
