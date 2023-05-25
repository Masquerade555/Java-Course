import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Before Formatting Date and Time: "+localDateTime);

        DateTimeFormatter datetimeF = DateTimeFormatter.ofPattern
        ("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = localDateTime.format(datetimeF);
        System.out.println("After Formatting Date and Time: "+formattedDateTime);

    }
}
