import java.util.Scanner;

public class ex_16 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insert a year: ");
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 == 1 || year % 400 == 0) {
            System.out.println(year + " is a leap year");;
        } else {
            System.out.println(year + " is not a leap year");;
        }
    }
}
