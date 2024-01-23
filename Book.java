// Book.java

/**
 * Represents a book with details.
 */
public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;
    private boolean available;

    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.available = true; // Initially, the book is available
    }

    // Getters and setters for other fields

    /**
     * Returns a string representation of the book.
     *
     * @return String representation of the book.
     */
    @Override
    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nYear: " + year +
                "\nGenre: " + genre +
                "\nAvailability: " + (available ? "Available" : "Not Available") +
                "\n------------------------";
    }

    // Additional methods and logic specific to the Book class
}
