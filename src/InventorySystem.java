import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    // Key: SKU (String), Value: Stock Quantity (Integer)
    private Map<String, Integer> stockTable;

    public InventorySystem() {
        this.stockTable = new HashMap<>();
    }

    // Add a new product or increase existing stock
    public void addStock(String sku, int quantity) {
        if (quantity <= 0) return;

        // if key exists, add to existing value; otherwise, set to quantity
        stockTable.put(sku, stockTable.getOrDefault(sku, 0) + quantity);
        System.out.println("📦 Stock Updated: " + sku + " total quantity is now " + stockTable.get(sku));
    }

    // Check out an item / reduce stock
    public void reduceStock(String sku, int quantity) {
        if (!stockTable.containsKey(sku)) {
            System.out.println("❌ Error: Product " + sku + " does not exist.");
            return;
        }

        int currentStock = stockTable.get(sku);
        if (currentStock < quantity) {
            // Instead of a print statement, we throw our custom exception!
            throw new InsufficientStockException("Cannot deduct " + quantity + " units of " + sku + ". Only " + currentStock + " available.");
        } else {
            stockTable.put(sku, currentStock - quantity);
            System.out.println("💸 Shipped " + quantity + " units of " + sku);
        }
    }

    // Check stock for a specific item instantly
    public int checkStock(String sku) {
        return stockTable.getOrDefault(sku, 0);
    }
}