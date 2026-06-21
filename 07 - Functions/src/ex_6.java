import java.util.Scanner;

public class ex_6 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program calculates a product between two numbers without using * operator");
        System.out.print("First number: ");
        int n1 = scan.nextInt();
        System.out.print("Second number: ");
        int n2 = scan.nextInt();
        System.out.println("product: " + product(n1, n2));
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
