import java.util.Scanner;

public class ex_11 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        while (n < 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a number: ");
            n = s.nextInt();
        }
    }

    public static boolean hasNoOddNumbers(int n) {
        if (n == 0) {
            return true;
        } else {
            return n % 2 == 0 && hasNoOddNumbers(n / 10);
        }
    }
}
