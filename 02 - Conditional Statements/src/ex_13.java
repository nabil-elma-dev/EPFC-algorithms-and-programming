import java.util.Scanner;

public class ex_13 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a time");
        System.out.print("Hour: ");
        int h = scan.nextInt();
        System.out.print("Minute: ");
        int min = scan.nextInt();

        if (min == 59) {
            min = 0;
            ++h;
        } else {
            ++min;
        }

        System.out.println("The time after a minute: " + h + ":" + min);
    }
}
