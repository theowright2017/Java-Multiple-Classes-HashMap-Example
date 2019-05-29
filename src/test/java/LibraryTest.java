import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private EachBook book;
    private EachBook book2;
    private EachBook book3;
    private Library library;
    private Library library2;
    private Customer customer;

    @Before

    public void setUp() {
        library = new Library(5);
        library2 = new Library(10);
        customer = new Customer("Tony Stark");
        book = new EachBook("Fahrenheit 451", 
                          "Ray Bradbury", 
                           "Fiction");
        book2 = new EachBook("Natives",
                            "Akala",
                            "Non-fiction");
        book3 = new EachBook("My Life",
                            "Elon Musk",
                            "Autobiography");
        
    }

    @Test
    public void countNumberOfBooksInLibrary() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLibraryStock() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.countBooks());
    }

    @Test
    public void canRentBookToCustomer() {
        library.addBook(book);
        library.addBook(book);
        customer.rentBookFromLibrary(library);
        assertEquals(1, library.countBooks());
        assertEquals(1, customer.countMyRentedBooks());

    }

    @Test
    public void keepTrackOfBooksByGenre() {
        library2.addBook(book);
        library2.addBook(book);
        library2.addBook(book2);
        library2.addBook(book2);
        library2.addBook(book2);
        library2.addBook(book3);
        assertEquals(1, library2.countBooksByGenre());


    }

//
//    @Test
//    public void countBooksByGenre() {
//
//
//        Map<String, Integer> byGenre = new HashMap<String, Integer>();
//        for String genre:
//    }
}

