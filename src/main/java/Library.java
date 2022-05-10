import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;

    public Library(){
        this.collection = new ArrayList<>();
    }

    public int collectionSize(){
        return this.collection.size();
    }

    public void addBook(Book book){
        this.collection.add(book);
    }
}
