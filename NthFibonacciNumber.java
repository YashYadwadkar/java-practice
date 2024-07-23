
import java.util.Scanner;

public class NthFibonacciNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int n = scanner.nextInt();

        long result = findNthFibonacciTerm(number, n);
        System.out.println(result);

        scanner.close();
    }

    public static long findNthFibonacciTerm(int start, int n) {
        long a = 0, b = 1;
        long current = a + b;

        // Find the first Fibonacci number >= start
        while (current < start) {
            a = b;
            b = current;
            current = a + b;
        }

        // Continue the sequence for n more terms
        for (int i = 0; i < n; i++) {
            a = b;
            b = current;
            current = a + b;
        }

        return current;
    }
}
