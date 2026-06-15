import java.util.Scanner;

public class ex_8 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program compares the first number and the last one (before -1 insertion)");
        int count = 0;
        int prec = 0;

        System.out.print("Next number: ");
        int next = scan.nextInt();
        int first = next;

        while (next != -1) {
            prec = next;
            System.out.print("Next number: ");
            next = scan.nextInt();
            ++ count;
        }

        if (count == 0) {
            System.out.println("Program stopped without any insertion");
        } else {
            if (first > prec) {
                System.out.println("First number is greater than the last one");
            } else if (first < prec) {
                System.out.println("Last number is greater than the first one");
            } else {
                System.out.println("First number and last one are equals");
            }
        }
    }
}
