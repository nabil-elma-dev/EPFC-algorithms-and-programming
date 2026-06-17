import java.util.Scanner;

public class ex_2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    // ex3();
    // ex5();
    ex7();
    }

    public static void ex3() {
        System.out.println("This program will calculate an average of n numbers (n given by the user)");
        System.out.print("How many numbers will be inserted? ");
        int nbNumbers = scan.nextInt();

        while (nbNumbers <= 0) {
            System.out.println("Only positive numbers are allowed!");
            System.out.print("How many numbers will be inserted? ");
            nbNumbers = scan.nextInt();
        }

        int sum = 0;
        int cpt = 1;

        do {
            System.out.print("Insert next number: ");
            sum += scan.nextInt();
            ++cpt;
        } while (cpt <= nbNumbers);

        System.out.println("Average: " + (double)sum / nbNumbers);
        System.out.println();
    }

    public static void ex5() {
        System.out.println("This program calculates an average of n added numbers (to stop, insert -1)");
        int sum = 0;
        int count = 0;

        System.out.print("Next number: ");
        int next = scan.nextInt();

        if (next != -1) {
            do {
                sum += next;
                ++ count;
                System.out.print("Next number: ");
                next = scan.nextInt();
            } while (next != -1);
        }

        if (count == 0) {
            System.out.println("Program stopped without any insertion");
        } else {
            System.out.println("The average is: " + (double) sum / count);
        }
    }

    public static void ex7() {
        System.out.println("This program detects the number just before -1");
        int count = 0;
        int prec = 0;

        System.out.print("Next number: ");
        int next = scan.nextInt();

        if (next != -1) {
            do {
                prec = next;
                System.out.print("Next number: ");
                next = scan.nextInt();
                ++ count;
            } while (next != -1);
        }

        if (count == 0) {
            System.out.println("Program stopped without any insertion");
        } else {
            System.out.println("The last inserted number is: " + prec);
        }
    }

}
