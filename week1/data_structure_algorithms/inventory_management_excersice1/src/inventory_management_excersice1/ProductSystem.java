package inventory_management_excersice1;

import java.util.*;

class Product {
    String productId;
    String productName;
    int quantity;
    double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "ProductID: " + productId + ", Name: " + productName + ", Qty: " + quantity + ", Price: ₹" + price;
    }
}

class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        for (Product product : products) {
            if (product.productId.equals(productId)) {
                product.setQuantity(quantity);
                product.setPrice(price);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct(String productId) {
        products.removeIf(product -> product.productId.equals(productId));
    }

    public void showInventory() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
