import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(id, name, marks));

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Students Available!");
                    } else {
                        for (Student s : students) {
                            s.displayStudent();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchID = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.getStudentID() == searchID) {
                            s.displayStudent();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    double total = 0;

                    for (Student s : students) {
                        total += s.getMarks();
                    }

                    if (students.size() > 0) {
                        System.out.println("Average Marks = "
                                + (total / students.size()));
                    } else {
                        System.out.println("No Students Available!");
                    }
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}