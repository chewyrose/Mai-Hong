import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input width and height
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Calculate area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Print results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

