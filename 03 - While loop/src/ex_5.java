import java.util.Scanner;

public class ex_5 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program calculates an average of n added numbers (to stop, insert -1)");
        int sum = 0;
        int count = 0;

        System.out.print("Next number: ");
        int next = scan.nextInt();

        while (next != -1) {
            sum += next;
            ++ count;
            System.out.print("Next number: ");
            next = scan.nextInt();
        }

        if (count == 0) {
            System.out.println("Program stopped without any insertion");
        } else {
            System.out.println("The average is: " + (double) sum / count);
        }
    }
}
