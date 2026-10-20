import java.util.Scanner;

public class ex_04 {
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
        System.out.println(n + "^" + exp + " equals " + powerOf(n, exp));
    }

    public static int powerOf(int n, int exp) {
        return exp > 1 ? n * powerOf(n, exp - 1) :
                exp > 0 ?
                        n
                        : 1;

    }

    public static int profPowerOf(int n, int exp) {
        return incrementalPower(n, exp, 1);
    }

    public static int incrementalPower(int n, int exp, int result) {
        if (n == 0)
            return result;
        return incrementalPower(n, exp - 1, n * result);
    }


}
