import java.util.Scanner;

public class ex_7 {
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
            res *= b;
        }
        return res;
    }


}
