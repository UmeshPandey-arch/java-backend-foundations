public class SmsNotification implements NotificationChannel {
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("💬 Sending SMS to " + userId + ": " + message);
    }
}