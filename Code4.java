@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class Code4 {
    public static void main(String[] args) {
        
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Division by zero!");
            return a / b;
        };
        Calculator power = (a, b) -> (int) Math.pow(a, b); // User-defined power function

        
        System.out.println("5 + 3 = " + add.compute(5, 3));
        System.out.println("5 - 3 = " + subtract.compute(5, 3));
        System.out.println("5 * 3 = " + multiply.compute(5, 3));
        System.out.println("6 / 3 = " + divide.compute(6, 3));
        System.out.println("2 ^ 4 = " + power.compute(2, 4));

    
        try {
            System.out.println("5 / 0 = " + divide.compute(5, 0));
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}