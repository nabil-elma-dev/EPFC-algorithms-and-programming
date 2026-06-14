import java.util.Scanner;

public class ex_17 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert 2 numbers");
        System.out.print("Integer 1: ");
        int n1 = scan.nextInt();
        System.out.print("Integer 2: ");
        int n2 = scan.nextInt();

        if (n1 > 0 && n2 > 0 || n1 < 0 && n2 < 0) {
            System.out.println("Their product is a positive number");
        } else if (n1 == 0 || n2 == 0) {
            System.out.println("Their product is 0");
        } else {
            System.out.println("Their product is a negative number");
        }
    }
}
