import java.util.Scanner;

public class ex_4 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many numbers will be inserted? ");
        int n = scan.nextInt();

        while (n <= 0) {
            System.out.println("Please insert a positive number!");
            System.out.print("How many numbers will be inserted? ");
            n = scan.nextInt();
        }

        System.out.print("Next number: ");
        int min = scan.nextInt();

        for (int i = 1; i < n; ++i) {
            System.out.print("Next number: ");
            int next = scan.nextInt();
            if (next < min) {
                min = next;
            }
        }

        System.out.print("Min value: " + min);
    }
}
