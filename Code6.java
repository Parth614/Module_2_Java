import java.util.Scanner;

public class Code6 {

    
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        java.util.function.Function<Integer, Integer> squareFunction = Code6 ::square;

        int result = squareFunction.apply(number);

        System.out.println("Square of " + number + " is: " + result);

        scanner.close();
    }
}