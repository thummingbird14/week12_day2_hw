import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("The Eyre Affair", "Jasper FForde", "Fantasy");
        book2 = new Book("Jane Eyre", "Charlotte Bronte", "Classics");
        book3 = new Book("He Said, She Said", "Erin Kelly", "Thriller");
    }

    @Test
    public void libraryBeginsEmpty(){
        assertEquals(0, library.collectionSize());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.collectionSize());
    }

}
