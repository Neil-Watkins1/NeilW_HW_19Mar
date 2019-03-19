import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryStock;
    private int capacity;

    public Library(int capacity){
        this.libraryStock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.libraryStock.size();
    }

    public void addBook(Book book) {
        if (countBooks() < checkCapacity())
        this.libraryStock.add(book);
    }

    public int checkCapacity() {
       return this.capacity;
    }

    public void remove(Book book) {
        this.libraryStock.remove(0);
    }

    public Book removeFromStock(){
        Book bookRemoved = this.libraryStock.remove(0);
        return bookRemoved;
    }

}


//    Books should have title, author and genre.
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.