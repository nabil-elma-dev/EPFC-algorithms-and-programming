import java.util.Scanner;

public class ex_4 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        int n = scan.nextInt(); // 20
        int cpt = 0;
        int sum = 0;

        while (sum < n) {
            ++ cpt;
            sum += cpt;
        }

        System.out.println("n first positive numbers added before " + n + ": " +(cpt - 1)); // cpt - 1 because there is one extra hop surpassing n
    }
}
