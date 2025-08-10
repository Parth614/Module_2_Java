import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        System.out.println("\n--- try-catch Block ---");
        try {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error (try-catch): Division by zero!");
        }

        System.out.println("\n--- try-catch-finally Block ---");
        try {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error (try-catch-finally): Division by zero!");
        } finally {
            System.out.println("Finally block executed (always runs).");
        }

        scanner.close();
    }
}