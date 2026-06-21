import java.util.Scanner;

public class ex_9 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program calculates the factorial of a number");
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println("Required: positive or zero!");
            System.out.print("Enter a number: ");
            n = scan.nextInt();
        }
        System.out.println("Factorial: " + fact(n));

    }

    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; ++i) {
            res *= i;
        }
        return res;
    }
}
