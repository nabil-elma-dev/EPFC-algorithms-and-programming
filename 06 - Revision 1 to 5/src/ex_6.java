import java.util.Scanner;

public class ex_6 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program calculates the product between two numbers without the * operator");
        System.out.print("First number: ");
        int n1 = scan.nextInt();
        System.out.print("Second number: ");
        int n2 = scan.nextInt();
        int sum = 0;


        for (int i = 0; i < n2; ++i) {
            sum += n1;
        }

        System.out.println("The product is: " + sum);
    }
}
