import java.util.*;
public class MatrixIO{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total rows of the matrix :");
        int rows = sc.nextInt();
        System.out.print("Enter the total columns of the matrix :");
        int clms = sc.nextInt();
        int numbers [][] = new int [rows][clms];
        //input
        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < clms ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }//output
        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < clms ; j++){
                System.out.print(numbers[i][j] + " ");
            }System.out.println();
        }
    }
}