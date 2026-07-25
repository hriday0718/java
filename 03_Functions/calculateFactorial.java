import java.util.*;
public class calculateFactorial{
    public static int theFactorial(int n){
        if (n<0){
            return -1;
        }else{
            int factorial = 1;
            for (int i=n;i>=1;i--){
                factorial = factorial*i;
            }return factorial;
        }
    }public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number whose factorial is to be determined :");
        int n = sc.nextInt();
        int f = theFactorial(n);
        if (f == -1){
            System.out.println("Invalid Number.");
        }else{
            System.out.println("The factorial of the number is :" + f );
        }sc.close();
    }
}