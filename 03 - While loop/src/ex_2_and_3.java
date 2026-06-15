import java.util.Scanner;

public class ex_2_and_3 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
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

        while (cpt <= nbNumbers) {
            System.out.print("Insert next number: ");
            sum += scan.nextInt();
            ++cpt;
        }
        System.out.println("Average: " + (double)sum / nbNumbers);
        System.out.println();
    }
}
