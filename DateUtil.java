// DateUtil.java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class for date-related operations.
 */
public class DateUtil {

    /**
     * Formats a date to a specified string format.
     *
     * @param date   The date to be formatted.
     * @param format The desired date format.
     * @return The formatted date as a string.
     */
    public static String formatDate(Date date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    /**
     * Parses a string to a Date object using a specified format.
     *
     * @param dateString The string representing the date.
     * @param format     The format of the date string.
     * @return The parsed Date object.
     * @throws ParseException If the parsing fails.
     */
    public static Date parseDate(String dateString, String format) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.parse(dateString);
    }

    // Additional date-related utility methods based on requirements
}
