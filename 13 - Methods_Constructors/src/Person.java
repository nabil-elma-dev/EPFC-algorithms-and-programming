import java.util.Scanner;

public class Person {
    public static Scanner s = new Scanner(System.in);

    public String firstName, lastName;
    public Date ddn;

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
}
