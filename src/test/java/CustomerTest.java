import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private EachBook book;

//    @Before
//    public void setUp() {
//        customer = new Cus
//    }


    @Test
    public void countRentedBooks() {
        customer = new Customer("Johnny Cage");
        book = new EachBook("Fahrenheit 451",
                "Ray Bradbury",
                "Fiction");
        customer.addRentedBook(book);
        assertEquals(1, customer.countMyRentedBooks());
    }
}
