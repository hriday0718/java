import java.util.*;
public class NumberAnalysisFunction{
    public static int checkPrime(int n){
        if (n<=1){
            return -1;
        }else{
            for (int i =2;i<=Math.sqrt(n);i++){
                if (n % i ==0){
                    return 0;
                }
            }return 1;    
        }    
    }public static int checkEven(int n){
        if (n < 1){
            return -2;
        }if (n%2==0){
            return 2;
        }else{
            return 3;
        }
    }public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number  : ");
        int n = sc.nextInt();
        int cp= checkPrime(n);
        int ce = checkEven(n);
        if (cp == 1){
            System.out.println("The number is Prime.");
        }else if (cp == 0){
            System.out.println("The number is not prime.");
        }else{
            System.out.println("Enter valid number.");
        }if (ce == 2){
            System.out.println("The number is Even.");
        }else if (ce == 3){
            System.out.println("The number is Odd.");
        }else{
            System.out.println("Enter valid number.");
        }sc.close();
    }   
}