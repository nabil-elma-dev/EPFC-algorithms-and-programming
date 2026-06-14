import java.util.Scanner;

public class ex_4 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two integers");
        System.out.print("First integer: ");


        int n1 = scan.nextInt();
        System.out.print("Second integer: ");
        int n2 = scan.nextInt();

        System.out.println("Original sequence: " + n1 + " " + n2);

        System.out.print("Reversed sequence: " + n1 + " " + n2);
    }
}
