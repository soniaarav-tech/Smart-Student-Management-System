package main;

import java.util.Scanner;
import model.Student;
import service.StudentManager;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        boolean running = true;

        while (running) {

            System.out.println("\n=================================");
            System.out.println(" SMART STUDENT MANAGEMENT SYSTEM");
            System.out.println("=================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Show Statistics");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                System.out.print("Enter Registration Number: ");
                long regno = scanner.nextLong();

                scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Course: ");
                String course = scanner.nextLine();

                System.out.print("Enter Marks: ");
                double marks = scanner.nextDouble();

                Student student = new Student(regno, name, course, marks);

                manager.addStudent(student);

                break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter registration no.: ");

                    long searchRegno = scanner.nextLong();

                    manager.searchStudent(searchRegno);
                    break;

                case 4:
                    System.out.println("Enter registration no.: ");
                    long updateRegno = scanner.nextLong();

                    System.out.println("Enter new marks: ");
                    double updateNewMarks = scanner.nextDouble();

                    manager.updateMarks(updateRegno, updateNewMarks);
                    break;

                case 5:
                    System.out.println("Enter registration no.: ");
                    long delRegno = scanner.nextLong();

                    manager.deleteStudent(delRegno);

                    break;

                case 6:
                    manager.statisticStudent();
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}