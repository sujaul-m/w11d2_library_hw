import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;

    private Library library;

    @Before
    public void setUp(){
        book1 = new Book("Harry Potter and the Philosophers Stone", "J K Rowling", "Mystery");
        book2 = new Book("Harry Potter and the Chamber of Secrets", "J K Rowling", "Mystery");

        library = new Library(2);
    }

    @Test
    public void doesLibraryHaveCapacitySet(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canCountBooksInLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.stockCount());
    }

    @Test
    public void canReturnCapacity() {
        assertEquals(true, library.hasCapacity());
    }

    @Test
    public void addBookIfThereIsRoom() {
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cantAddBookWhenThereIsNoRoom() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book2);

        assertEquals(2, library.stockCount());
    }
}

