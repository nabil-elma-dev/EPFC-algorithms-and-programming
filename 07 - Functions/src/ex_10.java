import java.util.Scanner;

public class ex_10 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program determine whether a number is a multiple of another one");
        System.out.print("First number: ");
        int n1 = scan.nextInt();
        System.out.print("Second number: ");
        int n2 = scan.nextInt();

        if (n2 > n1) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }

        if (isMulti(n1, n2)) {
            if (n1 > n2) {
                printSuccessfulMessage(n1, n2);
            } else {
                printSuccessfulMessage(n2, n1);
            }
        } else {
            if (n1 > n2) {
                printUnfruitfulMessage(n1, n2);
            } else {
                printUnfruitfulMessage(n2, n1);
            }
        }
    }

    public static void printSuccessfulMessage(int biggerNumber, int smallerNumber) {
        if (biggerNumber != smallerNumber) {
            System.out.println(biggerNumber + " is multiple of " + smallerNumber);
        } else {
            System.out.println(biggerNumber + " is equal to " + smallerNumber);
        }
    }

    public static void printUnfruitfulMessage(int biggerNumber, int smallerNumber) {
        System.out.println(biggerNumber + " is not multiple of " + smallerNumber);
    }

    private static boolean isMulti(int biggerNumber, int smallerNumber) {
        return biggerNumber % smallerNumber == 0;
    }
}
