import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

    // Main
    public static void main() {
        // Dates
        Date d1 = new Date();
        Date d2 = new Date();

        saisie(d1);
        saisie(d2);
        affiche(d1);
        affiche(d2);
        System.out.println(compare(d1, d2));

        // People
        Person p1 = new Person();
        Person p2 = new Person();
    }

    // Date and Person builders
    public static void saisie(Date d) {
        System.out.println("Enter a date.");
        System.out.print("Day: ");
        d.day = s.nextInt();
        System.out.print("Month: ");
        d.month = s.nextInt();
        System.out.print("Year: ");
        d.year = s.nextInt();
    }

    public static void saisie(Person p) {

    }

    // Date and Person printers
    public static void affiche(Date d) {
        System.out.println(d.day + "-" + d.month + "-" + d.year);
    }

    public static void affiche(Person p) {

    }

    // Date and Person comparators
    public static int compare(Date d1, Date d2) {
        return (d1.year * 10000 + d1.month * 100 + d1.day) - (d2.year * 10000 + d2.month * 100 + d2.day);
    }

//    public static int compareAge(Person p1, Person p2) {
//
//    }
//
//    public static int compareNomPrenom(Person p1, Person p2) {
//
//    }
}
