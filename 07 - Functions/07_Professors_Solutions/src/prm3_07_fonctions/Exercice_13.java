package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_13 {

    public static void afficheCarre(int hauteur) {
        for (int ligne = 0; ligne < hauteur; ++ligne) {
            for (int colonne = 0; colonne < hauteur; ++colonne) 
                System.out.print("X ");
            System.out.println();
        }        
    }


    public static void main(String[] args) {
        String s = bonzai('a', 3, "Yahoo");

        System.out.println(s);
    }
    public static String bonzai(char a, int b, String s ){
        return a + " " + b + " " + s;
    }
}
