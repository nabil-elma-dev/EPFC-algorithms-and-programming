package prm_11_strings;

import eu.epfc.prm.Array;
import java.util.Scanner;

public class Exercice_16 {

    public static boolean estMin(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean estMaj(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean estAlpha(char c) {
        return estMin(c) || estMaj(c);
    }

    public static char toMaj(char c) {
        if (estMin(c)) {
            return (char) ((int)c + (int) 'A' - (int) 'a');
        }
        return c;
    }

    public static void comptageDansTableauFreq(String s, Array<Integer> freq) {
        for (int k = 0; k < s.length(); ++k) {
            if (estAlpha(s.charAt(k))) {
                int rang = (int)toMaj(s.charAt(k)) - (int)'A';
                int ancienneVal = freq.get(rang);
                freq.set(rang, ancienneVal + 1);
            }
        }
    }

    public static void affichageTableauFreq(Array<Integer> freq) {
        for (int k = 0; k < freq.size(); ++k) {
            if (freq.get(k) != 0) {
                char lettre = (char) (k + (int)'A');
                System.out.print(lettre + " : " + freq.get(k) + " ");
            }
        }
        System.out.println();
    }

    public static void afficheFreq(String s) {
        Array<Integer> tab = new Array<>();
        tab.extend(26, 0);
        comptageDansTableauFreq(s, tab);
        affichageTableauFreq(tab);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un texte : ");
        String texte = in.nextLine();
        afficheFreq(texte);
    }
}
