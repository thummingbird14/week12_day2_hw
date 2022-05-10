import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("The Eyre Affair", "Jasper Fforde", "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The Eyre Affair", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Jasper Fforde", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }
}
