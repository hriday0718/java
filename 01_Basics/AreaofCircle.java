import java .util.*;
public class AreaofCircle{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter radius value :");
        double radius = sc.nextDouble();
        double area = Math.PI*(Math.pow(radius,2));
        double circumference = 2*Math.PI*radius;
        System.out.println("Radius       :" + radius);
        System.out.println("Area         :" + area);
        System.out.println("circumference:" + circumference);
        sc.close();
    }
}