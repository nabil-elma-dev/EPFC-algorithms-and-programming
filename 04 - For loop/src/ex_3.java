import java.util.Scanner;

public class ex_3 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many numbers will be inserted? ");
        int n = scan.nextInt();

        while (n <= 0) {
            System.out.println("Please insert a positive number!");
            System.out.print("How many numbers will be inserted? ");
            n = scan.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; ++i) {
            System.out.print("Next number: ");
            sum += scan.nextInt();
        }

        System.out.println("Average: " + (double) sum / n);
    }
}
