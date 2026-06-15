import java.util.Scanner;

public class ex_2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insert a number: ");
        int n = scan.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.println(i + " x " + n + " = " + (i*n));
        }
    }
}
