import java.util.Scanner;

public class ex_5 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How many numbers will be inserted? ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println("Please insert a positive number!");
            System.out.print("How many numbers will be inserted? ");
            n = scan.nextInt();
        }

        int posNumber = 0;
        int negNumber = 0;
        int zero = 0;

        for (int i = 0; i < n; ++i) {
            System.out.print("Next number: ");
            int current = scan.nextInt();
            if (current > 0)
                ++posNumber;
            else if (current < 0)
                ++negNumber;
            else
                ++zero;
        }

        System.out.println("Number of positive numbers: " + posNumber);
        System.out.println("Number of negative numbers: " + negNumber);
        System.out.println("Number of 0s: " + zero);
    }
}
