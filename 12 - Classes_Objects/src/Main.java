import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

    // Main
    public static void main() {
        // Dates
//        Date d1 = new Date();
//        Date d2 = new Date();
//
//        saisie(d1);
//        saisie(d2);
//        affiche(d1);
//        affiche(d2);
//        System.out.println(compare(d1, d2));

        // People
        Person p1 = new Person();
        Person p2 = new Person();
        saisie(p1);
        saisie(p2);
        affiche(p1);
        affiche(p2);
        printMessageAge(compare(p1.birthDate, p2.birthDate), p1, p2);
    }

    // Date and Person builders
    public static void saisie(Date d) {
        System.out.println("Enter a date.");
        System.out.print("Day: ");
        d.day =  Integer.parseInt(s.nextLine());
        System.out.print("Month: ");
        d.month = Integer.parseInt(s.nextLine());
        System.out.print("Year: ");
        d.year = Integer.parseInt(s.nextLine());
    }

    public static void saisie(Person p) {
        System.out.println("Enter your name");
        System.out.print("First name: ");
        p.firstName = s.nextLine();
        System.out.print("Last name: ");
        p.lastName = s.nextLine(); // (!) compound names might trigger a InputMismatchException if saisie(Date) with nextInt
        p.birthDate = new Date();
        System.out.print("Birth day: ");
        saisie(p.birthDate);
    }

    // Date and Person printers
    public static void affiche(Date d) {
        System.out.println(d.day + "-" + d.month + "-" + d.year);
    }

    public static void affiche(Person p) {
        System.out.print(p.firstName + " " + p.lastName + "; Birth date: ");
        affiche(p.birthDate);
    }

    // Date and Person comparators
    public static int compare(Date d1, Date d2) {
        return (d1.year * 10000 + d1.month * 100 + d1.day) - (d2.year * 10000 + d2.month * 100 + d2.day);
    }

    public static int compareAge(Person p1, Person p2) {
        return compare(p1.birthDate, p2.birthDate);
    }

//    public static int compareNomPrenom(Person p1, Person p2) {
//
//    }

    public static void printMessageAge(int n, Person p1, Person p2) {
        System.out.println( n > 0 ?
                p1.firstName + " " + p1.lastName + " is younger than " + p2.firstName + " " + p2.lastName
                : n < 0 ?
                    p1.firstName + " " + p1.lastName + " is older than " + p2.firstName + " " + p2.lastName
                    : p1.firstName + " " + p1.lastName + " and " + p2.firstName + " " + p2.lastName + " have the same age"
        );

    }
}
