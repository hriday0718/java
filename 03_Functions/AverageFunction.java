import java.util.*;
public class AverageFunction{
    public static double calculateAverage(int n , Scanner sc){
        double sum = 0;
        for (int i=1;i<=n;i++){
            System.out.print("Enter number" + i + ":");
            sum += sc.nextDouble();
        }return sum/n;
    }
    public static void main(String args []){
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter how many numbers :");
            int n = sc.nextInt();
            double avg = calculateAverage(n,sc);
            System.out.println("Average" + avg);
            sc.close();
    }
}