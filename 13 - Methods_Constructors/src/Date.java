import java.util.Scanner;

public class Date {
    public static Scanner s = new Scanner(System.in);
    public int day, month, year;

    public void saisie() {
        System.out.println("Enter a date: ");
        System.out.print("Day: ");
        this.day = s.nextInt();
        System.out.print("Month: ");
        this.month = s.nextInt();
        System.out.print("Year: ");
        this.year = s.nextInt();
    }

    public void affiche() {
        System.out.println(this.day + "-" + this.month + "-" + this.year);
    }

    public int compareTo(Date other) {
        return (this.year * 10000 + this.month * 100 + this.day) - (other.year * 10000 + other.month * 100 + other.day);
    }
}
