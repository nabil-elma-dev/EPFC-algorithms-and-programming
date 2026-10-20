import java.util.Scanner;

public class ex_10 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        while (n < 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a number: ");
            n = s.nextInt();
        }
        System.out.println("Number of 2 inside " + n + " is equal to " + nbOfTwo(n)); // 3
    }

    public static int nbOfTwo(int n) {
        int nbDigits = ex_06.numberOfDigits(n);
        if (n < 10) {
            return n == 2 ?
                1
                : 0;
        } else {
            return n % 10 == 2 ?
                1 + nbOfTwo(n / 10)
                : nbOfTwo(n / 10);
        }
    }
}
