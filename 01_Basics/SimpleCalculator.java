import java.util.*;
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a    :");
        double a = sc.nextDouble();
        System.out.print("Enter b    :");
        double b = sc.nextDouble();
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Remainder");
        System.out.print("Enter the code required  :");
        int choice = sc.nextInt();
        switch (choice){
            case 1 : System.out.println("Addition        :" + (a+b));
            break;
            case 2 : System.out.println("Subtraction     :" + (a-b));
            break;
            case 3 : System.out.println("Multiplication  :" + (a*b));
            break;
            case 4 : if (b != 0){
                System.out.println("Division        :" + (a/b));
            }else{
                System.out.print("Cannot divide by zero");
            }
            break;
            case 5 : System.out.println("Remainder       :" + (a%b));
            break;
            default: System.out.println("Invalid code number");
        }sc.close();
    }
}