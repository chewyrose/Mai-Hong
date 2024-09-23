import java.util.Scanner;
import java.lang.Math;
public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        double n = scanner.nextDouble();

        // Calculate sin, cos, and square root
        double sinValue = Math.sin(n);
        double cosValue = Math.cos(n);
        double sqrtValue = Math.sqrt(n);

        // Print results
        System.out.println("sin(" + n + ") = " + sinValue);
        System.out.println("cos(" + n + ") = " + cosValue);
        System.out.println("sqrt(" + n + ") = " + sqrtValue);
    }
}
