import java.time.LocalDateTime;

public class AuditLogger {
    public static void log(String productId, String action) {
        String timestamp = LocalDateTime.now().toString();
        System.out.println("[LOG] Product " + productId + ": " + action + " at " + timestamp);
    }
}