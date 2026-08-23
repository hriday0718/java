import java.util.*;
public class Power{
    public static int thePow(int x , int a){
        return (int) Math.pow (x,a);
    }public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the base number:");
        int x = sc.nextInt();
        System.out.print("Enter the power:");
        int a = sc.nextInt();
        int result = thePow(x,a);
        System.out.print("The number " + x + " raised to the power of " + a + " is:" + result + "\n");
    }
}