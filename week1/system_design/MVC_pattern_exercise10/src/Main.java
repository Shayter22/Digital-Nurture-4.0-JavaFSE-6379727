public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ananya");
        student.setId("S123");
        student.setGrade("A");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Ravi");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
