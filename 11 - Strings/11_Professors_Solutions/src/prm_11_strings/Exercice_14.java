package prm_11_strings;

import java.util.Scanner;

public class Exercice_14 {
    
    // Pré: val >= 0
    public static String intPositifToString(int val) {
        if(val < 0) throw new RuntimeException("intPositifToString d'un négatif: " + val);
        String res = "";
        do {
            char c = (char) (val % 10 + (int)'0');
            res = c + res;
            val /= 10;
        } while (val != 0);

        return res;
    }

    public static String intToString(int val) {
        String res = intPositifToString(Math.abs(val));
        if (val < 0) {
            res = "-" + res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int i = in.nextInt();
        String s = intToString(i);
        System.out.println("Le revoici sous forme de string de taille " + s.length() + " : " + s);
    }
}
