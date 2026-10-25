package service;

import java.util.ArrayList;
import model.Student;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        for (Student existingStudent : students) {

            if (existingStudent.getRegno() == student.getRegno()) {
                System.out.println("Registration number already exists!");
                return;
            }
        }

        students.add(student);

        System.out.println(
            "Student " + student.getRegno() + " added successfully!"
        );
    }

    public void displayAllStudents() {

        if (students.isEmpty()){
            System.out.println("No Students Found.");
            return;
        }

        for (Student student : students) {
            student.DisplayStudent();
            System.out.println("----------------");
        }
    }

    public void searchStudent(long regno) {

        if (students.isEmpty()){
            System.out.println("No Students Found.");
            return;
        }

        for (Student student : students) {

            if (student.getRegno() == regno) {
                System.out.println("Student " + student.getRegno() + " Found.");
                student.DisplayStudent();
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public void updateMarks(long regno, double newMarks) {

        if (students.isEmpty()){
            System.out.println("No Students Found.");
            return;
        }

        for (Student student : students) {

            if (student.getRegno() == regno) {

                student.setMarks(newMarks);

                System.out.println(
                    "Marks Updated To " + student.getMarks() + " Successfully!"
                );

                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public void deleteStudent(long regno) {

        if (students.isEmpty()){
            System.out.println("No Students Found.");
            return;
        }

        for (Student student : students) {

            if (student.getRegno() == regno) {

                students.remove(student);

                System.out.println(
                    "Student " + student.getRegno() + " Deleted Successfully!"
                );

                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public void statisticStudent() {

        if (students.isEmpty()){
            System.out.println("No Students Found.");
            return;
        }

        double sum = 0;
        int totalCount = 0;
        int passCount = 0;

        for (Student student : students) {
            sum = sum + student.getMarks();
            totalCount++;
        }

        double mean = sum / totalCount;

        System.out.println("Total No. of Students is " + totalCount);

        System.out.println("Average Marks = " + mean);

        for (Student student : students) {

            if (student.getMarks() >= 40) {
                passCount++;
            }
        }

        double passRate = ((double) passCount / totalCount) * 100;

        System.out.println("The pass rate is " + passRate + "%");
    }
}