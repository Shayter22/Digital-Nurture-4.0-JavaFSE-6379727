package sorting_customer_order_exercise3;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Anil", 4500.0),
            new Order("O002", "Bina", 7800.0),
            new Order("O003", "Chirag", 3000.0),
            new Order("O004", "Dev", 9200.0)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("\nSorted by Bubble Sort:");
        SortAlgorithms.bubbleSort(orders);
        for (Order o : orders) {
            System.out.println(o);
        }

        Order[] orders2 = {
            new Order("O001", "Anil", 4500.0),
            new Order("O002", "Bina", 7800.0),
            new Order("O003", "Chirag", 3000.0),
            new Order("O004", "Dev", 9200.0)
        };

        System.out.println("\nSorted by Quick Sort:");
        SortAlgorithms.quickSort(orders2, 0, orders2.length - 1);
        for (Order o : orders2) {
            System.out.println(o);
        }
    }
}
