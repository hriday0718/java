import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your section: ");
        String section = sc.next();

        System.out.print("Enter your roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Are you a hosteller? (true/false): ");
        boolean hosteller = sc.nextBoolean();

        System.out.println("\n------ Student Details ------");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Section    : " + section);
        System.out.println("Roll No.   : " + rollNo);
        System.out.println("CGPA       : " + cgpa);
        System.out.println("Hosteller  : " + hosteller);

        sc.close();
    }
}