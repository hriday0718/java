import java.util.*;
public class VotingEligibility{
    public static int isEligible(int age){
        if (age >= 18){
            return 1;
        }else if(age < 18 && age > 0){
            return 0;
        }else{
            return -1;
        }
    }public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person:");
        int age = sc.nextInt();
        int m = isEligible(age);
        if (m == 1){
            System.out.print("The person of age " + age + " is eligible to vote.\n");
        }else if(m == 0){
            System.out.print("The person of age " + age + " is not eligible to vote.\n");
        }else{
            System.out.print("Enter valid age.\n");
        }sc.close();
    }
}