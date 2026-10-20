import java.util.Scanner;

public class ex_03 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        while (n <= 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a number: ");
            n = s.nextInt();
        }
        System.out.println("Fibonacci number at position " + n + " is " + fibobacci(n));
    }

    public static int fibobacci(int n) {
        return n > 2 ?
                fibobacci(n - 1) + fibobacci(n - 2)
                : n != 0 ?
                    1
                    : 0;
    }
}
