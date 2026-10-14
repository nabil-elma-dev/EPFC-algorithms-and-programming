package exercise_2;

import eu.epfc.prm3.Array;

public class CountryMedals {
    public String country;
    public int medals = 1; // default value when added to list

    public CountryMedals(String country) {
        this.country = country;
    }

    public void incrementMedals() {
        this.medals += 1;
    }

    public int compareMedals(CountryMedals other) {
        return this.medals - other.medals;
    }

    @Override
    public String toString() {
        return this.country + " :\t\t" + this.medals + " medal(s)";
    }
}
