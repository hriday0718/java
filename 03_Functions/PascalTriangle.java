import java.util.*;
public class PascalTriangle{
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1 ; i <= n ; i++){
            fact = fact*i;
        }return fact;
    }public static int combination(int n , int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }public static void printPascalTriangle(int rows){
        for (int i = 0 ; i <= rows ; i ++){
            //spaces
            for (int j = 0 ; j <= rows-i ; j++){
                System.out.print(" ");
            }//numbers
            for (int j = 0 ; j <= i ; j++){
                System.out.print(combination(i,j) + " ");
            }System.out.println();
        }
    }public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int row = sc.nextInt();
        printPascalTriangle(row);
    }
}