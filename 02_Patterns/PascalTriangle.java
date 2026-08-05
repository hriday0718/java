import java.util.*;
public class PascalTriangle{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Pascal's Triangle Pattern");
        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        for(int i = 1;i <= rows ;i++){
            
            for (int j =1 ;j <= rows-i ;j++){
                System.out.print(" ");
            }

            //nCr+1=nCr*(n-r/r+1)

            int num = 1;
            for (int j=1;j<=i;j++){
                System.out.print(num + " ");
                num = num * (i-j)/j;
            }System.out.println();
        }sc.close();
    }
}