import java.util.Scanner;

public class ex_3 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determines the maximum between 2 numbers");
        System.out.print("First number: ");
        int n1 = scan.nextInt();
        System.out.print("Second number: ");
        int n2 = scan.nextInt();
        System.out.println("Maximum: " + maxNumber(n1, n2));
    }

    private static int maxNumber(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}
