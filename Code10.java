import java.util.Scanner;
import java.math.BigInteger;

public class Code10 {

    public static BigInteger factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Negative numbers not allowed for factorial.");
        }
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        try {
            BigInteger result = factorial(num);
            System.out.println("Factorial: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
