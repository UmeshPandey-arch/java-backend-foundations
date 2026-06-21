public class EmailNotification implements NotificationChannel {
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("📧 Sending Email to " + userId + ": " + message);
    }
}