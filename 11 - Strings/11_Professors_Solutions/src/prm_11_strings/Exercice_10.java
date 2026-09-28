package prm_11_strings;

import java.util.Scanner;

public class Exercice_10 {

    public static boolean sontEgaux(String s1, String s2) {
        boolean result = s1.length() == s2.length();
        int k = 0;
        while (result && k < s1.length()) {
            result = s1.charAt(k) == s2.charAt(k);
            ++k;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez deux mots : ");
        String premier = in.next();
        String second = in.next();

        if (sontEgaux(premier, second)) {
            System.out.println("Ces deux mots sont identiques.");
        } else {
            System.out.println("Ces deux mots ne sont pas identiques.");
        }
    }
}
