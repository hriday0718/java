import java.util.*;
public class InvertedHalfPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i=1;i<=rows;i++){//(int i =n ;i >= 1;i--)
            for (int j=i;j<=rows;j++){//(int j=1;j<=i;j++)
                System.out.print("*");
            }System.out.println();
        }sc.close();
    }
}