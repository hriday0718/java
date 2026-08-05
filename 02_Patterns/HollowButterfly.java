import java.util.*;
public class HollowButterfly{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Hollow Butterfly Pattern");
        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        for(int i = 1;i <= rows ;i++){
            for (int j=1;j<=i;j++){
                if (j==1 || j==rows || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }for (int j=1;j<=(2*(rows-i));j++){
                System.out.print(" ");
            }for (int j = 1;j<=i;j++){
                if (j==1||j==rows||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }for(int i = rows;i >= 1 ;i--){
            for (int j=1;j<=i;j++){
                if (j==1 || j==rows || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }for (int j=1;j<=(2*(rows-i));j++){
                System.out.print(" ");
            }for (int j = 1;j<=i;j++){
                if (j==1||j==rows||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }sc.close();
    }
}