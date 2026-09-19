import java.util.*;
public class ArrayIO{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        String arr[] = new String [n];
        System.out.println("Enter the elements in the Array :");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.next();
        }System.out.println("The Elements of the array are :");
        for (int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    }
}