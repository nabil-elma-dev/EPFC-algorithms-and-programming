import java.util.Scanner;

public class ex_7 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int qty = 0;
        int next;

        System.out.println("This program displays how many times a certain positive number (chosen by the user) " +
                "appeared in a cluster of numbers (sentinel: -1)");
        System.out.print("Insert here the chased number: ");

        int target = scan.nextInt();

        while (target < 0) {
            System.out.println("Only positive numbers are allowed!");
            System.out.print("Insert here the chased number: ");
            target = scan.nextInt();
        }

        do {
            System.out.print("Next number: ");
            next = scan.nextInt();
            if (next == target)
                ++ qty;
        } while (next != -1);

        System.out.println("Number of times " + target + " appeared: " + qty);
    }
}
