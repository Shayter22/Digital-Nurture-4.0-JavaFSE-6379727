package task_management_system_exercise5;

class Task {
    String taskId;
    String taskName;
    String status;
    Task next;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    public String toString() {
        return "TaskID: " + taskId + ", Name: " + taskName + ", Status: " + status;
    }
}
