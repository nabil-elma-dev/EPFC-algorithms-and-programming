import java.util.Scanner;

public class ex_7 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insert a positive number: ");
        int n = scan.nextInt();

        while (n <= 0) {
            System.out.println("Please insert a positive number!");
            System.out.print("Insert a positive number ");
            n = scan.nextInt();
        }

        int fct = 1;

        for (int i = 1; i <= n; ++i) {
            fct *= i;
        }

        System.out.println("Factorial of " + n + ": " + fct);
    }
}
