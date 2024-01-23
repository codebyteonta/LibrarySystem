// LibrarySystem.java
import java.util.Scanner;

/**
 * Main class to run the library system.
 */
public class LibrarySystem {
    public static void main(String[] args) {
        // Instantiate objects
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Main program loop
        while (true) {
            // Display menu
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");

            // Get user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Perform actions based on user choice
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    Book newBook = new Book(title, author, year);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter book title to remove: ");
                    String bookTitleToRemove = scanner.nextLine();
                    Book bookToRemove = new Book(bookTitleToRemove, "", 0);
                    library.removeBook(bookToRemove);
                    System.out.println("Book removed successfully.");
                    break;

                case 3:
                    System.out.println("List of Books in the Library:");
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting the Library System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
