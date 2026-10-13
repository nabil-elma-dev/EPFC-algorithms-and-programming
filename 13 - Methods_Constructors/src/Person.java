import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    public static final LocalDate CURRENT_DATE = LocalDate.now();
    public static final int CURRENT_YEAR = CURRENT_DATE.getYear();
    public static final int CURRENT_DAY_OF_MONTH = CURRENT_DATE.getDayOfMonth();
    public static final int CURRENT_MONTH = CURRENT_DATE.getMonthValue();
    public static Scanner s = new Scanner(System.in);

    public String firstName, lastName;
    public Date ddn;

    public Person(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ddn = new Date(day, month, year);
    }

    public Person() {}

    public void saisie() {
        System.out.println("Enter new person's data.");
        System.out.print("First name: ");
        this.firstName = s.next();
        System.out.print("Last name: ");
        this.lastName = s.next();
        this.ddn = new Date();
        this.ddn.saisie();
    }

    public void affiche() {
        System.out.print(this.firstName + " " + this.lastName + "; " +
                "Date of birth: ");
        this.ddn.affiche();
    }

    public int compareToAge(Person other) {
        return - this.ddn.compareTo(other.ddn);
    }

    public int compareTo(Person other) {
        return this.firstName.compareToIgnoreCase(other.firstName) == 0 ?
                this.lastName.compareToIgnoreCase(other.lastName)
                : this.firstName.compareToIgnoreCase(other.firstName);
    }

    public int getAge() {
        return CURRENT_MONTH < this.ddn.month
                || CURRENT_MONTH == this.ddn.month && CURRENT_DAY_OF_MONTH < this.ddn.day ?
                CURRENT_YEAR - this.ddn.year - 1
                : CURRENT_YEAR - this.ddn.year;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + "; Date of birth: " + ddn.toString();
    }
}