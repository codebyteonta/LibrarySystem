// Person.java
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a person who can borrow books.
 */
public class Person {
    private String name;
    private int age;
    private String id;
    private List<Book> borrowedBooks;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and setters for other fields

    /**
     * Borrows a book and adds it to the list of borrowed books.
     *
     * @param book The book to be borrowed.
     */
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(name + " has successfully borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book " + book.getTitle() + " is not available for borrowing.");
        }
    }

    /**
     * Returns a borrowed book and removes it from the list of borrowed books.
     *
     * @param book The book to be returned.
     */
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println(name + " has successfully returned the book: " + book.getTitle());
        } else {
            System.out.println("Error: The book " + book.getTitle() + " is not in the list of borrowed books.");
        }
    }

    /**
     * Displays the list of books borrowed by the person.
     */
    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + "'s Borrowed Books:");
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle());
            }
        }
    }

    // Additional methods and logic specific to the Person class
}
