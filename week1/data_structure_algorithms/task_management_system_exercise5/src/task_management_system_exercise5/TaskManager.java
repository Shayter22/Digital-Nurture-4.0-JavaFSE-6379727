package task_management_system_exercise5;

class TaskManager {
    private Task head;

    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = task;
        }
    }

    public Task searchTask(String taskId) {
        Task current = head;
        while (current != null) {
            if (current.taskId.equals(taskId)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.taskId.equals(taskId)) {
            head = head.next;
            return;
        }

        Task current = head;
        while (current.next != null) {
            if (current.next.taskId.equals(taskId)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void showAllTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
