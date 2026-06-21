public class Main {
    public static void main(String[] args) {
        // We declare the type as the Interface, but instantiate the concrete Class
        NotificationChannel channel = new EmailNotification();
        channel.sendNotification("user_101", "Your Spring Boot journey has begun!");

        // Swap the implementation seamlessly
        channel = new SmsNotification();
        channel.sendNotification("user_101", "Keep up the great momentum!");
    }
}