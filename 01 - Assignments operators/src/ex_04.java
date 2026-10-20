import java.util.Scanner;

public class ex_04 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two integers");
        System.out.print("First integer: ");


        int n1 = scan.nextInt();
        System.out.print("Second integer: ");
        int n2 = scan.nextInt();

        System.out.println("Original sequence: " + n1 + " " + n2);

        int tmp = n1;
        n1 = n2;
        n2 = tmp;

        System.out.print("Reversed sequence: " + n1 + " " + n2);
    }
}
