import java.util.Scanner;

public class ex_6 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insert a number: ");
        int n = scan.nextInt();
        if (n > 0 && n < 11) {
            System.out.println("Inserted number is between 1 and 10");
        } else {
            System.out.println("Inserted number is not between 1 and 10");
        }
    }
}
