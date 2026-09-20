import java.util.*;
public class checkAscendingorder{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        int numbers[] = new int [size];
        System.out.println("Enter the array elements :=>");
        for (int i = 0 ; i < size ; i++){
            numbers[i] = sc.nextInt();
        }boolean isAscending = true;
        for (int i = 0 ; i < numbers.length - 1 ; i++){
            if (numbers[i] > numbers[i+1]){
                isAscending = false;
            }
        }if (isAscending){
            System.out.println("Array is in ascending order.");
        }else{
            System.out.println("Array isn't in ascending order.");
        }
    }
}