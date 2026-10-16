import java.util.Scanner;

public class ex_13 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        while (n < 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a number: ");
            n = s.nextInt();
        }
        System.out.println("The biggest digit inside " + n + " is " + maxVal(n));
    }

    public static int maxVal(int n) {
        return scrollNumbers(n, 0);
    }

    public static int scrollNumbers(int n, int maxVal) {
        if (n < 10) {
            return Math.max(maxVal, n);
        }
        return scrollNumbers(n / 10, Math.max(maxVal, n % 10));
    }
}
