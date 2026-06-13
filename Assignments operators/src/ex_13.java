import java.util.Scanner;

public class ex_13 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter 4 numbers");
        System.out.print("First number: ");
        sum += scan.nextInt();
        System.out.print("Second number: ");
        sum += scan.nextInt();
        System.out.print("Third number: ");
        sum += scan.nextInt();
        System.out.print("Fourth number: ");
        sum += scan.nextInt();
        System.out.println("The sum of the four number is " + sum);
    }
}
