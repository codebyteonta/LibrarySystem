// Utils.java
import java.util.Random;

/**
 * Utility class for common operations.
 */
public class Utils {

    /**
     * Generates a random alphanumeric ID of a specified length.
     *
     * @param length The length of the generated ID.
     * @return The generated random alphanumeric ID.
     */
    public static String generateRandomId(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder idBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            idBuilder.append(randomChar);
        }

        return idBuilder.toString();
    }

    // Additional utility methods based on requirements
}
