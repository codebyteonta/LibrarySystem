// Library.java
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library and manages books.
 */
public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     *
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Removes a book from the library.
     *
     * @param book The book to be removed.
     */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Displays the list of books in the library.
     */
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Additional methods and logic specific to the Library class
}
