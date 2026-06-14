import java.util.Scanner;

public class ex_9 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three integers");
        System.out.print("First integer: ");
        int n1 = scan.nextInt();
        System.out.print("Second integer: ");
        int n2 = scan.nextInt();
        System.out.print("Third integer: ");
        int n3 = scan.nextInt();

        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }

        System.out.println("Max = " + max);
    }
}
