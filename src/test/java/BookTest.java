import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    public Book book;


    @Before
    public void setup(){
        book = new Book("War and Peace", "Leo Tolstoy", "Classics");

    }
    @Test
    public void bookHasTitle(){
        assertEquals("War and Peace", book.getTitle());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("Leo Tolstoy", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Classics", book.getGenre());
    }
}


//
//    Books should have title, author and genre.
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.
