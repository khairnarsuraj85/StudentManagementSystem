import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentDAO studentDao = new StudentDAO();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nStudent Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter department: ");
            String dept = scanner.nextLine();
            
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            
            Student student = new Student(0, name, email, dept, age);
            studentDao.addStudent(student);
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewAllStudents() {
        try {
            List<Student> students = studentDao.getAllStudents();
            if (students.isEmpty()) {
                System.out.println("No students found!");
                return;
            }
            System.out.println("\nStudent List:");
            for (Student s : students) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void updateStudent() {
        try {
            System.out.print("Enter student ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter new email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter new department: ");
            String dept = scanner.nextLine();
            
            System.out.print("Enter new age: ");
            int age = scanner.nextInt();
            
            Student student = new Student(id, name, email, dept, age);
            studentDao.updateStudent(student);
            System.out.println("Student updated successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void deleteStudent() {
        try {
            System.out.print("Enter student ID to delete: ");
            int id = scanner.nextInt();
            studentDao.deleteStudent(id);
            System.out.println("Student deleted successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}