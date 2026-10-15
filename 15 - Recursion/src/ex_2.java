import java.util.Scanner;

public class ex_2 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        while (n <= 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a number: ");
            n = s.nextInt();
        }
        System.out.println("Factorial of " + n + " is " + fact(n));
        // todo: search -> after a certain big value, negative, then again positive, then 0
    }

    public static int fact(int n) {
        return n > 1 ?
                n * fact(n - 1)
                : 1;
    }
}
