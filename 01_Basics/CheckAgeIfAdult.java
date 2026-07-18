import java.util.*;
public class CheckAgeIfAdult{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the age of the person  :");
        int age = sc.nextInt();
        boolean isAdult = (age >= 18);
        System.out.println("Age                :" + age);
        System.out.println("Person is an adult :" + isAdult);
        if (isAdult){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }sc.close();
    }
}