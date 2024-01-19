package mavenWeeklyProject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LibraryCatalog {
    private static final Logger logger = LoggerFactory.getLogger(LibraryCatalog.class);
    private List<Catalog> catalog;

    public LibraryCatalog() {
        this.catalog  = new ArrayList<>();
    }

    public List<Catalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Catalog> catalog) {
        this.catalog = catalog;
    }

    public void addItem(Catalog catalogItem) {
        catalog.add(catalogItem);
    }

    public void removeItem(Catalog catalogItem) {
        catalog.remove(catalogItem);
    }

    public void removeItemByIsnb(Long isbn) {
        catalog.removeIf(item -> item.getIsbn().equals(isbn));
    }

    public Optional<Catalog> searchByIsbn(Long isbn) {
        return catalog.stream()
                .filter(item -> item.getIsbn().equals(isbn))
                .findFirst();
    }

    public List<Catalog> searchByPublicationYear(int year) {
        return catalog.stream()
                .filter(item -> item.getPublicationYear() == year)
                .toList();
    }

    public List<Catalog> searchByAuthor(String author) {
        return catalog.stream()
                .filter(item -> ((Book) item).getAuthor().equals(author))
                .toList();
    }

    public void saveToDisk(String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(catalog);
            logger.info("Catalog saved to disk successfully.");
        } catch (IOException error) {
            logger.error("Error saving catalog to disk.", error);
        }
    }

    public void loadFromDisk(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            catalog = (List<Catalog>) ois.readObject();
            logger.info("Catalog loaded from disk successfully.");
        } catch (IOException | ClassNotFoundException error) {
            logger.error("Error loading catalog from disk.", error);
        }
    }

}
