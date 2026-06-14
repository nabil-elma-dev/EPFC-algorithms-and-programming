import java.util.Scanner;

public class ex_19 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert number of days: ");
        int nbDays = scan.nextInt();
        System.out.print("Insert number of km: ");
        int nbKm = scan.nextInt();
        double total = 250 * nbDays;

        if(nbKm > 50) {
            total += (nbKm - 50) * 1.25;
            if(nbKm > 500)
                total += (nbKm - 500) * 0.125;
        }

        System.out.println("Total price: " + total + " euros");
    }
}
