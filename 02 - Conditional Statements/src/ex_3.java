import java.util.Scanner;

public class ex_3 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Insert a number: ");
        int n = scan.nextInt();
        int abs;
        if (n < 0) {
            abs = n * -1;
        } else {
            abs = n;
        }
        System.out.println("Absolute value: " + abs);
    }
}
