import eu.epfc.prm3.Array;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Array<Person> people = buildPeopleArray();
        System.out.println("Collection before sorting: ");
        affiche(people);
        // sortPeopleSelection(people);
        // sortPeopleInsertion(people);
        sortPeopleBubble(people);
        System.out.println();
        System.out.println("Collection after sorting: ");
        affiche(people);
    }

    public static Array<Person> buildPeopleArray() {
        System.out.print("Nb people: ");
        int qty = Integer.parseInt(s.nextLine());
        Array<Person> people = new Array<>();
        for (int cpt = 0; cpt < qty; ++ cpt) {
            Person p = new Person();
            saisie(p);
            people.add(p);
        }
        return people;
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

    public static void affiche(Date d) {
        System.out.println(d.day + "-" + d.month + "-" + d.year);
    }

    public static void affiche(Person p) {
        System.out.print(p.firstName + " " + p.lastName + "; Birth date: ");
        affiche(p.birthDate);
    }

    public static void affiche(Array<Person> people) {
        for (Person p : people) {
            affiche(p);
        }
    }

    public static int compare(Date d1, Date d2) {
        return (d1.year * 10000 + d1.month * 100 + d1.day) - (d2.year * 10000 + d2.month * 100 + d2.day);
    }

    public static int compareAge(Person p1, Person p2) {
        return compare(p1.birthDate, p2.birthDate);
    }

    public static int compareNames(Person p1, Person p2) {
        return p1.firstName.compareToIgnoreCase(p2.firstName) != 0 ?
                p1.firstName.compareToIgnoreCase(p2.firstName)
                : p1.lastName.compareToIgnoreCase(p2.lastName);
    }

    public static void sortPeopleSelection(Array<Person> people) {
        for (int i = 0; i < people.size(); ++i) {
            int priorityPersonsIndex = i;
            for (int j = i + 1; j < people.size(); ++j) {
                if (compareNames(people.get(priorityPersonsIndex), people.get(j)) > 0) {
                    priorityPersonsIndex = j;
                };
            }
            Person p = people.get(i);
            people.set(i, people.get(priorityPersonsIndex));
            people.set(priorityPersonsIndex, p);
        }
    }

    public static void sortPeopleInsertion(Array<Person> people) {
        for (int i = 1; i < people.size(); ++i) {
            Person currentPerson = people.get(i);
            int j = i;
            while (j > 0 && compareNames(currentPerson, people.get(j - 1)) < 0) {
                people.set(j, people.get(j - 1));
                --j;
            }
            people.set(j, currentPerson);
        }
    }

    public static void sortPeopleBubble(Array<Person> people) {
        for (int i = people.size() - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (compareNames(people.get(j), people.get(j+1)) > 0) {
                    Person p = people.get(j);
                    people.set(j, people.get(j +1));
                    people.set(j + 1, p);
                }
            }
        }
    }
}