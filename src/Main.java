public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Day 4: Inventory Engine via HashMap --- \n");

        InventorySystem inventory = new InventorySystem();

        // 1. Populate Inventory
        inventory.addStock("LAPTOP-MAC-01", 10);
        inventory.addStock("MOUSE-LOGI-99", 50);

        // 2. Simulate orders coming through
        System.out.println("\n--- Processing Outbound Shipments ---");
        inventory.reduceStock("MOUSE-LOGI-99", 2);      // Valid shipment
        inventory.reduceStock("LAPTOP-MAC-01", 12);     // Over-order block check
        inventory.reduceStock("KEYBOARD-RGB-12", 1);    // Non-existent key check

        // 3. Instant verification lookup
        System.out.println("\n--- Final Direct Lookup Test ---");
        String lookupKey = "MOUSE-LOGI-99";
        System.out.println("Current active stock for " + lookupKey + " is: " + inventory.checkStock(lookupKey));
    }
}