package mavenWeeklyProject;

import java.time.LocalDate;


public class Magazine extends Catalog{

    private Periodicity periodicity;

    public Magazine(String title, int publicationYear, int pageCount, Periodicity periodicity) {
        super(title, publicationYear, pageCount);
        this.periodicity = periodicity;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "  title='"             + getTitle() + '\'' +
                ", publicationYear='"   + getPublicationYear() + '\'' +
                ", pageCount='"         + getPageCount() + '\'' +
                "  periodicity="        + periodicity +
                ", ISBN='"              + getIsbn() + '\'' +
                '}';
    }
}
