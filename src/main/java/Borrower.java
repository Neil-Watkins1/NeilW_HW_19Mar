import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.borrowedBooks.size();
    }

    public void borrow(Book book) {
        this.borrowedBooks.add(book);
    }


    public void borrowFromLibrary(Library library) {
        Book bookRemoved = library.removeFromStock();
        this.borrow(bookRemoved);
    }
}

