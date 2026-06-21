import java.util.Scanner;

public class ex_4 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determines whether a number is negative");
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        if (negative(n)) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is not negative");
        }

    }

    private static boolean negative(int n) {
        return n < 0;
    }

}
