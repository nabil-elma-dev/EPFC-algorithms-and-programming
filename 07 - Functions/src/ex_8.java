import java.util.Scanner;

public class ex_8 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program executes a power of a number");
        System.out.print("Base: ");
        int b = scan.nextInt();
        System.out.print("Exp: ");
        int exp = scan.nextInt();
        while (exp < 0) {
            System.out.println("Required exp: positive or zero!");
            System.out.print("Enter a number: ");
            exp = scan.nextInt();
        }
        System.out.println(b + "^" + exp + ": " + powerOfB(b, exp));
    }

    private static int powerOfB(int b, int exp) {
        int res = 1;
        for (int i = 0; i < exp; ++i) {
            res = product(b, res);
        }
        return res;
    }

    private static int product(int n1, int n2) {
        int res = 0;

        if (n2 < 0) {
            n2 = -n2;
            n1 = -n1;
        }

        for (int i = 0; i < n2; ++i) {
            res += n1;
        }
        return res;
    }
}
