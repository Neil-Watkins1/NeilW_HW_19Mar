import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    public Borrower borrower;
    public Book book;
    public Library library;

    @Before
    public void setup() {
        borrower = new Borrower("Neil");
        book = new Book ("Satanic Verses", "Salman Rushdie", "Fiction");
        library = new Library(3);
        library.addBook(book);
    }

    @Test
    public void canCountBorrowedBooks() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrow(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canBorrowFromLibrary() {
        borrower.borrowFromLibrary(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.countBooks());
    }
}





//    Add a third class which interacts with the other two. E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.