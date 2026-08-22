import java.util.*;
public class CountNumbers{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int choice ;
        int count1 = 0;
        int count0 = 0;
        int count2 = 0;
        do{
            System.out.println("Count Numbers");
            System.out.println("Enter 1 to Find the count of numbers.");
            System.out.println("Enter 0 to end the program.");
            choice = sc.nextInt();
            if (choice == 1){
                System.out.print("Enter the number:");
                int n = sc.nextInt();
                if(n > 0){
                    count1++;
                }else if(n == 0){
                    count0++;
                }else{
                    count2++;
                }
            }else if(choice == 0){
                System.out.println("Thank you!");
            }else{
                System.out.println("Enter valid choice.");
            }
        }while(choice != 0);
        System.out.print("The count of positive numbers is:" + count1 + "\n");
        System.out.print("The count of negative numbers is:" + count2 + "\n");
        System.out.print("The count of zeros is:" + count0 + "\n");
        sc.close();
    }
}