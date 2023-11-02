package HW_30.Library.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryLmplTest {
    Library library;
    Book[] b;

    @BeforeEach
    void setUp() {
        library = new LibraryLmpl(5);
        b = new Book[4];
        b[0] = new Book(1, "Author1", "Title1", 1974);
        b[1] = new Book(2,"Author2", "Title2", 1897);
        b[2] = new Book(3,"Author3", "Title3", 1965);
        b[3] = new Book(4, "Author4", "Title4", 1967);

        for (int i = 0; i < b.length; i++) {
            library.addBook(b[i]);
        }
    }


    @Test
    void addBook() {
        assertFalse(library.addBook(null));
        // не можем добавить второй раз, уже существующую книгу
        assertFalse(library.addBook(b[1]));
        Book book1 = new Book(5, "Author5", "Title6", 1988); // создали новую книгу
        assertTrue(library.addBook(book1)); //  добавили новую книгу
        assertEquals(5, library.quantity()); // теперь  5
        // создаем еще 1 новую книгу
        Book book2 = new Book(6, "Author6", "Title7", 2000); // создали новую книгу
        assertFalse(library.addBook(book2)); // не можем превысить capacity
    }

    @Test
    void removeBook() {

        assertEquals(b[1] ,library.removeBook(2));
        assertEquals(3, library.quantity()); //  стало на 1 меньше (4 - 1)
        assertNull(library.removeBook(2)); // дважды не можем удалить
        assertNull(library.findBook(2)); // не можем найти после удаления
    }

    @Test
    void findBook() {

        // ищем по id
        assertEquals( b[1], library.findBook(2));
        // ищем несуществующую книгу
        assertNull(library.findBook(12));
    }

    @Test
    void quantuty() {
        library.quantity();
    }

    @Test
    void printBook() {
        library.printBook();
    }
}