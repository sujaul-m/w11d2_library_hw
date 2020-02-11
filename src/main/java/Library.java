import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }

    public int stockCount() {
        return this.collection.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean hasCapacity() {
        return capacity > collection.size();
    }

    public void addBook(Book book) {
        if (hasCapacity()) {
            this.collection.add(book);
        }
    }
}