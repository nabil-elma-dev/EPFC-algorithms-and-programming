import eu.epfc.prm3.Array;

import java.util.Scanner;

public class Program {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // exercise_1();
        // exercise_2();
        exercise_3();
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
