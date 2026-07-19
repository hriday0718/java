import java.util.*;
public class SumOfNNaturalNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the nth number   :");
        int n = sc.nextInt();
        int Sum = 0;
        for (int i=1;i<=n;i++){
            Sum = Sum + i;
        }System.out.println("The sum of n numbers is  :" + Sum);
        sc.close();
    }
}