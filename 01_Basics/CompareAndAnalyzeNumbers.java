import java.util.*;

public class CompareAndAnalyzeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("        NUMBER ANALYZER");
        System.out.println("=================================");
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        // Comparison
        boolean isAGreater = (a > b);
        boolean isBGreater = (b > a);
        boolean isEqual = (a == b);
        // Even / Odd
        boolean isAEven = (a % 2 == 0);
        boolean isBEven = (b % 2 == 0);
        // Prime Check
        boolean isAPrime = true;
        boolean isBPrime = true;
        if (a <= 1) {
            isAPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isAPrime = false;
                    break;
                }
            }
        }
        if (b <= 1) {
            isBPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(b); i++) {
                if (b % i == 0) {
                    isBPrime = false;
                    break;
                }
            }
        }

        System.out.println("\n=================================");
        System.out.println("            RESULT");
        System.out.println("=================================");

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        System.out.println("\nComparison");
        System.out.println("--------------------");

        if (isAGreater) {
            System.out.println("A is greater than B.");
        } else if (isBGreater) {
            System.out.println("A is less than B.");
        } else if (isEqual) {
            System.out.println("A is equal to B.");
        }

        System.out.println("\nPrime Check");
        System.out.println("--------------------");

        if (isAPrime) {
            System.out.println(a + " is a Prime Number.");
        } else {
            System.out.println(a + " is not a Prime Number.");
        }

        if (isBPrime) {
            System.out.println(b + " is a Prime Number.");
        } else {
            System.out.println(b + " is not a Prime Number.");
        }

        System.out.println("\nEven / Odd Check");
        System.out.println("--------------------");

        if (isAEven) {
            System.out.println(a + " is Even.");
        } else {
            System.out.println(a + " is Odd.");
        }

        if (isBEven) {
            System.out.println(b + " is Even.");
        } else {
            System.out.println(b + " is Odd.");
        }

        System.out.println("=================================");

        sc.close();
    }
}