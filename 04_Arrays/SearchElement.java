import java.util.*;
public class SearchElement{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows :");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int clmns = sc.nextInt();
        int matrix [][] = new int [rows][clmns];
        //input
        System.out.println("Enter the elements of the matrix :");
        for (int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < clmns ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }System.out.print("Enter the number to be searched for :");
        int x = sc.nextInt(); 
        //search for x
        int ispresent = 0;
        for (int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < clmns ; j++){
                if (matrix[i][j] == x){
                    System.out.println(x + " is found in the location (" + (i+1) + "," + (j+1) +")");
                    ispresent = 1;
                }
            }
        }if (ispresent == 0){
            System.out.println("Element not found.");
        }
    }
}