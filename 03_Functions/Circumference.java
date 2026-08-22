import java.util.*;
public class Circumference{
    public static double calculateCircumference(double r){
        return 2*Math.PI*r;
    }public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int r = sc.nextInt();
        double c = calculateCircumference(r);
        System.out.printf("The circumference of the circle of radius" + r + "is:%.3f%n",c);
        sc.close();
    }
}