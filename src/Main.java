import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Day 3: Collections Challenge --- \n");

        // 1. Initialize an ArrayList for the Shopping Cart (Allows Duplicates)
        List<Product> cart = new ArrayList<>();

        Product laptop = new Product("MacBook Pro", 1299.99);
        Product mouse = new Product("Wireless Mouse", 29.99);

        // Adding elements to ArrayList
        cart.add(laptop);
        cart.add(mouse);
        cart.add(mouse); // Adding a duplicate item intentionally!

        System.out.println("🛒 Shopping Cart Contents (ArrayList):");
        for (Product item : cart) {
            System.out.println("- " + item);
        }
        System.out.println("Total items in cart: " + cart.size());

        System.out.println("\n--------------------------------------------\n");

        // 2. Initialize a HashSet for Unique Search Tags (No Duplicates Allowed)
        Set<String> searchTags = new HashSet<>();

        searchTags.add("Electronics");
        searchTags.add("Apple");
        searchTags.add("Gadgets");
        searchTags.add("Electronics"); // Attempting to add a duplicate tag

        System.out.println("🏷️ Unique Search Tags (HashSet):");
        for (String tag : searchTags) {
            System.out.println("#" + tag);
        }

        // Quick verification check
        if (searchTags.contains("Apple")) {
            System.out.println("\n✅ Quick search test: Found the tag 'Apple' instantly!");
        }
    }
}