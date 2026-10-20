import java.util.Scanner;

public class ex_06 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        while (n < 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a base: ");
            n = s.nextInt();
        }

        System.out.println(n + " has the following number of digits: " + numberOfDigits(n));
    }

    public static int numberOfDigits(int n) {
        return  (n >= 10) ?
            1 + numberOfDigits(n/10)
            : 1 ;
    }


}
