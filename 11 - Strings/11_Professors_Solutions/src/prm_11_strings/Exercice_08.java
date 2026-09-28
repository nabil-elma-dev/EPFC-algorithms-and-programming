package prm_11_strings;

import java.util.Scanner;

public class Exercice_08 {

    public static boolean estMin(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static char toMaj(char c) {
        if (estMin(c)) {
            return (char) ((int)c + (int) 'A' - (int) 'a');
        }
        return c;
    }

    public static boolean estPalindrome(String s) {
        int g = 0, d = s.length() - 1;
        boolean semble_ok = true;
        while (g < d && semble_ok) {
            if (s.charAt(g) == ' ') {
                ++g;
            } else if (s.charAt(d) == ' ') {
                --d;
            } else {
                semble_ok = toMaj(s.charAt(g)) == toMaj(s.charAt(d));
                ++g;
                --d;
            }
        }
        return semble_ok;
    }

    public static void main(String[] args) {
        String s = "radar";
        if (estPalindrome(s)) {
            System.out.println(s + " est un palindrome");
        } else {
            System.out.println(s + " n'est pas un palindrome");
        }

        s = "hello";
        if (estPalindrome(s)) {
            System.out.println(s + " est un palindrome");
        } else {
            System.out.println(s + " n'est pas un palindrome");
        }

        s = "Esope reste ici et se repose";
        if (estPalindrome(s)) {
            System.out.println(s + " est un palindrome");
        } else {
            System.out.println(s + " n'est pas un palindrome");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        s = in.nextLine();

        if (estPalindrome(s)) {
            System.out.println(s + " est un palindrome");
        } else {
            System.out.println(s + " n'est pas un palindrome");
        }
    }
}
