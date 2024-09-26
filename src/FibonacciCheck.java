import java.util.Scanner;

public class FibonacciCheck {
    public static String fibonacci(int n) {
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) {
                return n + " pertence à sequência de Fibonacci.";
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return n + " não pertence à sequência de Fibonacci.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();
        System.out.println(fibonacci(num));
        scanner.close();
    }
}
