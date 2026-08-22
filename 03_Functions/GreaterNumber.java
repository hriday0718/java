import java.util.*;
public class GreaterNumber{
    public static int theGreater(int a,int b){
        if(a > b){
            return 1;
        }else if(a < b){
            return -1;
        }else{
            return 0;
        }
    }public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        int v = theGreater(a,b);
        if (v == 1){
            System.out.print("1st Number is greater.\n");
        }else if(v == -1){
            System.out.print("2nd Number is greater.\n");
        }else{
            System.out.print("Both Are Equal.\n");
        }sc.close();
    }
}