import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    public Library library;
    public Book book;

    @Before
    public void setup(){
        library = new Library (3);
        book = new Book("Trainspotting", "Irvine Welsh", "Fiction");

    }
    @Test
    public void libraryCountBooks(){
        assertEquals(0, library.countBooks());

}
    @Test
    public void libraryCanAddBooks(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
}
@Test
public void libraryCannotAddBooksWhenStockFull(){
        library = new Library(1);
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.countBooks());
}
    @Test
    public void libraryHasCapacity(){
        assertEquals(3, library.checkCapacity());
    }

    @Test
    public void libraryCanRemoveBook() {
        library.addBook(book);
        library.addBook(book);
        library.remove(book);
        assertEquals(1, library.countBooks());
    }
}





//    Books should have title, author and genre. XXX
//        Write a method to count the number of books in the library. XXX
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.