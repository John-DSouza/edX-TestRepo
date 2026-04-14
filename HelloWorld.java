import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Print current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}