import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> booksBorrowed;

    public Borrower(String name){
        this.name = name;
        this.booksBorrowed = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getNumberBooksBorrowed(){
        return booksBorrowed.size();
    }

    public void borrowBook(Book book){
        this.booksBorrowed.add(book);
    }
}
