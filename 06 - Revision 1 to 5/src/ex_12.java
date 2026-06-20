import java.util.Scanner;

public class ex_12 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determines whether an arithmetic sequence is increasing (sentinel: -1)");

        System.out.print("Next number: ");
        int next = scan.nextInt();
        int prec = next;

        while (next != -1 && next >= prec) {
            prec = next;
            System.out.print("Next number: ");
            next = scan.nextInt();
        }

        if (next == -1) {
            System.out.println("This sequence is increasing");
        } else {
            System.out.println("This sequence is not increasing");
        }
    }
}
