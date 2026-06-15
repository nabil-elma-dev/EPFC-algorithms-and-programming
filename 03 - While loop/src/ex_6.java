import java.util.Scanner;

public class ex_6 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int cpt = 1;

        System.out.print("Insert a number: ");
        int n = scan.nextInt();

        System.out.print("Numbers whose square is less than " + n + " are: ");
        while (n > cpt*cpt) {
            System.out.print(cpt + " ");
            ++cpt;
        }
    }
}
