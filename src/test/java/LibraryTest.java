import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library(500);
        book1 = new Book("The Eyre Affair", "Jasper FForde", "Fantasy");
        book2 = new Book("Jane Eyre", "Charlotte Bronte", "Classics");
        book3 = new Book("He Said, She Said", "Erin Kelly", "Thriller");
        book4 = new Book("Imogen", "Jilly Cooper", "Romance");
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(500, library.getCapacity());
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

    @Test
    public void cannotAddBooksWhenNoCapacity(){
        library.setCapacity(3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.collectionSize());
    }

}
