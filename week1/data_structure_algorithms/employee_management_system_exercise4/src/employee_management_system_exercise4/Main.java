package employee_management_system_exercise4;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E101", "Anjali", "Manager", 80000));
        manager.addEmployee(new Employee("E102", "Ravi", "Developer", 60000));
        manager.addEmployee(new Employee("E103", "Priya", "Designer", 50000));

        System.out.println("All Employees:");
        manager.showAllEmployees();

        System.out.println("\nSearching for E102:");
        Employee found = manager.searchEmployee("E102");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Not found");
        }

        System.out.println("\nDeleting E102:");
        manager.deleteEmployee("E102");

        System.out.println("Employees after deletion:");
        manager.showAllEmployees();
    }
}
