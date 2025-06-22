package task_management_system_exercise5;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T101", "Design UI", "Pending"));
        manager.addTask(new Task("T102", "Write Backend", "In Progress"));
        manager.addTask(new Task("T103", "Test App", "Pending"));

        System.out.println("All Tasks:");
        manager.showAllTasks();

        System.out.println("\nSearching for T102:");
        Task found = manager.searchTask("T102");
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting T102");
        manager.deleteTask("T102");

        System.out.println("Tasks after deletion:");
        manager.showAllTasks();
    }
}
