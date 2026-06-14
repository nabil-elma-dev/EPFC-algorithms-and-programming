import java.util.Scanner;

public class ex_10 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three integers");
        System.out.print("First integer: ");
        int n1 = scan.nextInt();
        System.out.print("Second integer: ");
        int n2 = scan.nextInt();
        System.out.print("Third integer: ");
        int n3 = scan.nextInt();

        int tmp;

        // phase 1: pushing max value
        if (n1 > n2) {
            tmp = n1;
            n1 = n2;
            n2 = tmp;
        }

        if (n2 > n3) {
            tmp = n2;
            n2 = n3;
            n3 = tmp;
        }

        // phase 2: placing second-max value
        if (n1 > n2) {
            tmp = n1;
            n1 = n2;
            n2 = tmp;
        }

        System.out.println("increasing numerical order: " + n1 + " " + n2 + " " + n3);
    }
}
