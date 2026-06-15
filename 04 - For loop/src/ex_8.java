import java.util.Scanner;

public class ex_8 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program calculates the power of a number");
        System.out.print("Insert base: ");
        int base = scan.nextInt();
        System.out.print("Insert exposant: ");
        int exp = scan.nextInt();

        if (base == 0)
            if (exp <= 0)
                System.out.println("Impossible power");
            else
                System.out.println(0);
        else {
            double res = 1;
            boolean expNeg = false;
            if (exp < 0) {
                exp = -exp;
                expNeg = true;
            }
            for (int i = 0; i < exp; ++i) {
                res *= base;
            }
            if (expNeg) {
                res = 1 / res;
            }

            exp = expNeg ? -exp : exp;
            System.out.println(base + " raised to the power of " + exp + ": " + res);
        }
    }
}
