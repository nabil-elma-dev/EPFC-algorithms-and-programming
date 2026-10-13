import eu.epfc.prm3.Array;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // exercise_1();
        // exercise_2();
        // exercise_3();
        // exercise_4();
        // exercise_5();
        exercise_6();
    }

    public static void exercise_1() {
        Person p1 = new Person();
        p1.saisie();
        Person p2 = new Person();
        p2.saisie();
        if (p1.compareTo(p2) < 0) {
            System.out.println("People in alphabetical order: ");
            p1.affiche();
            p2.affiche();
        } else {
            System.out.println("People in alphabetical order: ");
            p2.affiche();
            p1.affiche();
        }
    }

    public static void exercise_2() {
        Array<Person> people = new Array<>();
        saisie(people);
        affiche(people);
    }

    public static void exercise_3() {
        Array<Person> people = new Array<>();
        saisie(people);

        System.out.print("The youngest person found is -> ");
        Person youngest = findYoungest(people);
        youngest.affiche();
    }

    public static void exercise_4() {
        Person p = new Person("Nabil", "El Mahfoudi", 1, 5, 1998);
        p.affiche();
    }

    public static void exercise_5() {
        Person p = new Person("Nabil", "El Mahfoudi", 1, 5, 1998);
        System.out.println(p);
    }

    public static void exercise_6() {
        Person p = new Person("Nabil", "El Mahfoudi", 1, 5, 1998);
        Person p2 = new Person("Big", "Benji", Person.CURRENT_DAY_OF_MONTH + 1, Person.CURRENT_MONTH, 1998);
        System.out.println("Age of " + p.firstName + " " + p.lastName + ": " + p.getAge());
        System.out.println("Age of " + p2.firstName + " " + p2.lastName + ": " + p2.getAge());
    }

    public static void saisie(Array<Person> people) {
        System.out.print("Nb. People: ");
        int qty = s.nextInt();
        for (int i = 0; i < qty; ++i) {
            System.out.println("Person number " + (i + 1));
            Person p = new Person();
            p.saisie();
            people.add(p);
        }
    }

    public static void affiche(Array<Person> people) {
        for (Person p : people) {
            p.affiche();
        }
    }

    public static Person findYoungest(Array<Person> people) {
        if (people.isEmpty()) {
            throw new RuntimeException("Attention! Empty collection!");
        }
        Person youngest = people.get(0);
        for (int i = 1; i < people.size(); ++i) {
            if (youngest.compareToAge(people.get(i)) > 0) {
                youngest = people.get(i);
            }
        }
        return youngest;
    }
}
