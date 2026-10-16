import java.util.Scanner;

public class ex_12 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        while (n < 0) {
            System.out.println("Enter a positive number!");
            System.out.print("Enter a number: ");
            n = s.nextInt();
        }
        reversedNumber(n);
    }

    public static void reversedNumber(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            reversedNumber(n/10);
        }
    }
}
