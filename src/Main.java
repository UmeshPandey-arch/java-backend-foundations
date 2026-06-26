public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Day 5: Exception Handling --- \n");

        InventorySystem inventory = new InventorySystem();
        inventory.addStock("IPHONE-15", 3);

        // Scenario A: This will work perfectly
        try {
            System.out.println("Attempting normal order...");
            inventory.reduceStock("IPHONE-15", 2);
            System.out.println("✅ Order A processed successfully!");
        } catch (InsufficientStockException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("\n--------------------------------------------\n");

        // Scenario B: This will trigger our validation exception
        try {
            System.out.println("Attempting to over-order...");
            inventory.reduceStock("IPHONE-15", 5); // Throws exception!
            System.out.println("✅ This line will never execute because of the error.");
        } catch (InsufficientStockException e) {
            // This block intercepts the crash and handles it safely
            System.out.println("🚨 System Alert: " + e.getMessage());
        }
        System.out.println("\n🚀 System sanity check: The program did not crash and continued running smoothly!");
    }
}