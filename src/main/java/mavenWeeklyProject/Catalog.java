package mavenWeeklyProject;

import java.time.LocalDate;

abstract class Catalog {
    private Long        isbn;
    private String      title;
    private int         publicationYear;
    private int         pageCount;

    public Catalog(String title, int publicationYear, int pageCount) {
        this.isbn               = randomISBN();
        this.title              = title;
        this.publicationYear    = publicationYear;
        this.pageCount          = pageCount;
    }

    public Long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Long randomISBN() {
        Long minLimit       = 100000000000L;
        Long maxLimit       = 999999999999L;
        Long generatedLong  = minLimit + (long) (Math.random() * (maxLimit - minLimit));
        return generatedLong;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", pageCount=" + pageCount +
                '}';
    }
}
