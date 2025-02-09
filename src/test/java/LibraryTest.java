import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class LibraryTest {
    Library library = new Library();

    @Test
    public void addBook() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        assertEquals(3, library.listBooks().size());
    }

    @Test
    public void removeBook() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        library.removeBook("Book 1");
        assertEquals(2, library.listBooks().size());
    }

    @Test
    public void listBooks() {
        List<String> booksTest = new ArrayList<>();
        booksTest.add("Book 1");
        booksTest.add("Book 2");
        library.addBook("Book 1");
        library.addBook("Book 2");
        assertEquals(booksTest, library.listBooks());
    }
}