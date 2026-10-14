package exercise_2;

import eu.epfc.prm3.Array;

public class Program {

    public static void main(String[] args) {
        Array<CountryMedals> countriesMedals = new Array<>();
        newMedal(countriesMedals, "Belgique");
        print(countriesMedals);
        newMedal(countriesMedals, "France");
        print(countriesMedals);
        newMedal(countriesMedals, "France");
        print(countriesMedals);
        newMedal(countriesMedals, "Allemagne");
        print(countriesMedals);
        newMedal(countriesMedals, "Belgique");
        print(countriesMedals);
        newMedal(countriesMedals, "Belgique");
        print(countriesMedals);
    }

    public static void newMedal(Array<CountryMedals> countriesMedals, String country) {
        int currentPos = 0;
        while (currentPos < countriesMedals.size() && countriesMedals.get(currentPos).country.compareToIgnoreCase(country) != 0) {
            ++currentPos;
        }
        addAndSortMedals(countriesMedals, currentPos, country);
    }

    private static void addAndSortMedals(Array<CountryMedals> countriesMedals, int pos, String country) {
        if (pos == countriesMedals.size()) {
            countriesMedals.add(new CountryMedals(country));
        } else {
            countriesMedals.get(pos).incrementMedals();
        }
            while (pos > 0 && countriesMedals.get(pos).compareMedals(countriesMedals.get(pos - 1)) > 0) {
                CountryMedals tmp = countriesMedals.get(pos - 1);
                countriesMedals.set(pos - 1, countriesMedals.get(pos));
                countriesMedals.set(pos, tmp);
            }
    }

    public static void print(Array<CountryMedals> medailles) {
        System.out.println("Médailles des pays :");
        for (CountryMedals m : medailles) {
            System.out.println(m);
        }
        System.out.println("============================================");
    }
}
