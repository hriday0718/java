import java.util.*;
public class TableFunction{
    public static void calculateTable(int n){
        for (int i = 1 ; i <= 10 ; i++){
            int tbl = n*i;
            System.out.println(tbl);
        }
    }
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.print("The number whose table is to be determined is :");
            int n = sc.nextInt();
            System.out.println("The Table ");
            calculateTable(n);
            sc.close();
        }
}