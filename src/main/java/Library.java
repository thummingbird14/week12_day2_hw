import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int collectionSize(){
        return collection.size();
    }

    public boolean stockIsFull(){
        if (collectionSize() >= capacity)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void addBook(Book book){
        if (!stockIsFull()){
            this.collection.add(book);
        }
    }
}
