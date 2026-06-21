package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_11 {

    // Renvoie true ssi a est multiple de b
    // Pré: a et b sont positifs
    public static boolean estMultipleDe(int a, int b) {
        return a % b == 0;
    }

//    // Renvoie true ssi n est premier
//    public static boolean estPremier(int n) {
//        int candidatDiviseur = 2;
//        while (candidatDiviseur < n && !estMultipleDe(n, candidatDiviseur)) {
//            ++candidatDiviseur;
//        }
//        return candidatDiviseur == n;
//    }

    
    // Solution (légèrement) plus rapide
    // Renvoie true ssi n est premier
    public static boolean estPremier(int n) {
        boolean result;
        if (n == 1) 
            result = false;
        else if (n % 2 == 0) 
            result = n == 2;
        else {
            int candidat = 3;
            while (candidat * candidat <= n && !estMultipleDe(n, candidat)) {
                candidat += 2;
            }
            result = candidat * candidat > n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer 1 nombre entier positif : ");
        int n = scan.nextInt();
        if (estPremier(n)) {
            System.out.println("Ce nombre est premier");
        } else {
            System.out.println("Ce nombre n'est pas premier");
            System.out.println("Voici tous les premiers inférieurs à 100 : ");
            for (int p = 2; p < 100; ++p) {
                if (estPremier(p)) {
                    System.out.print(p + " ");
                }
            }

        }
    }
}
