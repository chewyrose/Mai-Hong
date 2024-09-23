import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the length of the string
        int length = input.length();

        // Print the number of characters
        System.out.println("The string has " + length + " characters.");
    }
}

