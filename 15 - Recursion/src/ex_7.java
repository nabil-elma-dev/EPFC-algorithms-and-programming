import java.util.Scanner;

public class ex_7 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        while (n < 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a base: ");
            n = s.nextInt();
        }

        System.out.println("Sum of each digit composing " + n + " is equal to " + sumDigits(n));
    }

    private static int sumDigits(int n) {
        return n < 10 ?
                n
                : n % 10 + (sumDigits(n / 10));
    }


}
