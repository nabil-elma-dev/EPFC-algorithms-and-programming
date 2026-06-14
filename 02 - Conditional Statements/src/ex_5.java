import java.util.Scanner;

public class ex_5 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two integers");
        System.out.print("First integer: ");
        int n1 = scan.nextInt();
        System.out.print("Second integer: ");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println("First number is greater than the second one");
        } else if (n1 < n2) {
            System.out.println("First number is smaller than the second one");
        } else {
            System.out.println("First number and second one are equals");
        }
    }
}
