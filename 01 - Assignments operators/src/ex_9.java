import java.util.Scanner;

public class ex_9 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter four integers");
        System.out.print("First integer: ");
        int n1 = scan.nextInt();
        System.out.print("Second integer: ");
        int n2 = scan.nextInt();
        System.out.print("Third integer: ");
        int n3 = scan.nextInt();
        System.out.print("Fourth integer: ");
        int n4 = scan.nextInt();

        System.out.println("Original sequence: " + n1 + " " + n2 + " " + n3 + " " + n4);

        int tmp = n1;
        n1 = n4;
        n4 = tmp;

        tmp = n3;
        n3 = n2;
        n2 = tmp;

        System.out.println("Reversed sequence: " + n1 + " " + n2 + " " + n3 + " " + n4);
    }
}
