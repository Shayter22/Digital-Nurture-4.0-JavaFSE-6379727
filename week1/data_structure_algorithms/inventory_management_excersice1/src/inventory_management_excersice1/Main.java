package inventory_management_excersice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("P101", "Mouse", 100, 499.99);
        Product p2 = new Product("P102", "Keyboard", 50, 999.49);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.showInventory();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter Product ID to update:");
        String id = scanner.nextLine();

        System.out.println("Enter new quantity:");
        int qty = scanner.nextInt();

        System.out.println("Enter new price:");
        double price = scanner.nextDouble();

        inventory.updateProduct(id, qty, price);

        System.out.println("After updates:");
        inventory.showInventory();
    }
}
