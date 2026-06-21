import java.util.Scanner;

public class ex_5 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determines whether a positive number is even");
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println("Required: positive number!");
            System.out.print("Enter a number: ");
            n = scan.nextInt();
        }
        if (even(n)) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }

    private static boolean even(int n) {
        return n % 2 == 0;
    }
}
