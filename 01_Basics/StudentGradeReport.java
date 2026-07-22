import java.util.*;

public class StudentGradeReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("      STUDENT GRADE REPORT");
            System.out.println("=================================");
            System.out.println("Enter 1 to Generate Report");
            System.out.println("Enter 0 to Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            if (choice == 1) {

                System.out.print("\nEnter Student Name : ");
                String name = sc.nextLine();

                System.out.print("Enter Student Marks (0-100) : ");
                double marks = sc.nextDouble();

                System.out.println("\n========== REPORT ==========");

                System.out.println("Name  : " + name);
                System.out.println("Marks : " + marks);

                if (marks < 0 || marks > 100) {

                    System.out.println("Grade  : Invalid");
                    System.out.println("Result : Invalid Marks");

                } else if (marks >= 90) {

                    System.out.println("Grade  : A");
                    System.out.println("Result : PASS");

                } else if (marks >= 80) {

                    System.out.println("Grade  : B");
                    System.out.println("Result : PASS");

                } else if (marks >= 70) {

                    System.out.println("Grade  : C");
                    System.out.println("Result : PASS");

                } else if (marks >= 60) {

                    System.out.println("Grade  : D");
                    System.out.println("Result : PASS");

                } else {

                    System.out.println("Grade  : F");
                    System.out.println("Result : FAIL");

                }

                System.out.println("============================");

            } else if (choice == 0) {

                System.out.println("\nThank you for using Student Grade Report.");

            } else {

                System.out.println("\nInvalid Choice! Please enter 1 or 0.");

            }

        } while (choice != 0);

        sc.close();
    }
}