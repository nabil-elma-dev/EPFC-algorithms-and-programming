import java.util.Scanner;

public class ex_8 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three integers");
        System.out.print("First integer: ");
        int n1 = scan.nextInt();
        System.out.print("Second integer: ");
        int n2 = scan.nextInt();
        System.out.print("Third integer: ");
        int n3 = scan.nextInt();

        System.out.println("Original sequence: " + n1 + " " + n2 + " " + n3);

        int tmp = n1;
        n1 = n3;
        n3 = tmp;

        System.out.println("Reversed sequence: " + n1 + " " + n2 + " " + n3);
    }
}
