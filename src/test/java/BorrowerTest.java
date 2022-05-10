import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book1;

    @Before
    public void before(){
        borrower = new Borrower("Tanya");
        book1 = new Book("The Eyre Affair", "Jasper Fforde", "Fantasy");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Tanya", borrower.getName());
    }

    @Test
    public void booksBorrowedBeginsEmpty(){
        assertEquals(0, borrower.getNumberBooksBorrowed());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book1);
        assertEquals(1, borrower.getNumberBooksBorrowed());
    }
}
