// BorrowingRecord.java
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Represents a record of a book being borrowed.
 */
public class BorrowingRecord {
    private Book book;
    private Person borrower;
    private Date dateBorrowed;
    private Date dueDate;

    public BorrowingRecord(Book book, Person borrower) {
        this.book = book;
        this.borrower = borrower;
        this.dateBorrowed = new Date();
        this.dueDate = calculateDueDate();
    }

    // Getters for other fields

    /**
     * Calculates the due date for the borrowed book.
     *
     * @return The due date.
     */
    private Date calculateDueDate() {
        // Assume a borrowing period of 14 days
        long fourteenDaysInMillis = 14 * 24 * 60 * 60 * 1000L;
        return new Date(dateBorrowed.getTime() + fourteenDaysInMillis);
    }

    /**
     * Returns true if the book is overdue, false otherwise.
     *
     * @return True if the book is overdue, false otherwise.
     */
    public boolean isOverdue() {
        Date currentDate = new Date();
        return currentDate.after(dueDate);
    }

    /**
     * Displays the borrowing record details.
     */
    public void displayBorrowingRecord() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        System.out.println("Borrowing Record:");
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Borrower: " + borrower.getName());
        System.out.println("Date Borrowed: " + dateFormat.format(dateBorrowed));
        System.out.println("Due Date: " + dateFormat.format(dueDate));
        System.out.println("Status: " + (isOverdue() ? "Overdue" : "Not Overdue"));
        System.out.println("------------------------");
    }

    // Additional methods and logic specific to the BorrowingRecord class
}
