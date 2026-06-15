import java.util.Scanner;

public class ex_7 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program detects the number just before -1)");
        int count = 0;
        int prec = 0;

        System.out.print("Next number: ");
        int next = scan.nextInt();

        while (next != -1) {
            prec = next;
            System.out.print("Next number: ");
            next = scan.nextInt();
            ++ count;
        }

        if (count == 0) {
            System.out.println("Program stopped without any insertion");
        } else {
            System.out.println("The last inserted number is: " + prec);
        }
    }
}