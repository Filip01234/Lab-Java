import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul N pentru a afișa șirul Fibonacci până la N: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Șirul Fibonacci până la " + n + ": " + a + " " + b + " ");

        while (a + b <= n) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        System.out.println();
    }
}
