package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_05 {

//    // Détermine si n est pair
//    // Comme l'indique IntelliJ, le if ci-dessous est redondant
//    // La solution alternative ci-dessous est nettement plus élégante
//    // et doit être préférée
//    public static boolean estPair(int n) {
//        boolean result ;
//        if(n % 2 == 0)
//            result = true;
//        else
//            result = false;
//        return result;
//    }

    // Détermine si n est pair
    public static boolean estPair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer 1 nombre entier positif : ");
        int n = scan.nextInt();
        if (estPair(n))
            System.out.println("Ce nombre est pair");
        else
            System.out.println("Ce nombre n'est pas pair");
    }

}
