import java.util.Scanner;

public class ex_5 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter a base: ");
        int n = s.nextInt();
        while (n <= 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a base: ");
            n = s.nextInt();
        }
        System.out.print("Enter an exponent: ");
        int exp = s.nextInt();
        while (exp < 0) {
            System.out.println("Exponent must be positive or 0!");
            System.out.print("Enter an exponent: ");
            exp = s.nextInt();
        }
        System.out.println(n + "^" + exp + " equals " + powerOfFaster(n, exp));
    }

    public static int powerOfFaster(int n, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return n;
        } else {
            return exp % 2 == 0 ?
                    powerOfFaster(n, exp/2) * powerOfFaster(n, exp/2)
                    : n * powerOfFaster(n, exp/2) * powerOfFaster(n, exp/2);
        }
    }

    public static int profPowerOfFaster(int n, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp % 2 == 0) {
            return profPowerOfFaster(n * n, exp / 2);
        } else {
            return n * (profPowerOfFaster(n, exp - 1));
        }
    }
}
