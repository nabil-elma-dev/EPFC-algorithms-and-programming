import java.util.Scanner;

public class ex_5 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("This program determines the minimum and the maximum among the numbers inserted by the user (sentinel: 0)");

        System.out.print("Next number: ");
        int next = scan.nextInt();
        if (next == 0) {
            System.out.println("Being 0 the first number, the cluster is empty; therefore no minimum");
        }

        else {
            int min = next;
            int max = next;
            while (next !=0) {
                System.out.print("Next number: ");
                next = scan.nextInt();
                if (min > next && next != 0) {
                    min = next;
                } else if (max < next && next != 0) {
                    max = next;
                }
            }
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        }
    }
}
