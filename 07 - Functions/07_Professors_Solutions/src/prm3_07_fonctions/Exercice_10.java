package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_10 {

    // Renvoie true ssi a est multiple de b
    // Pré: a et b sont positifs
    public static boolean estMultipleDe(int a, int b) {

        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer deux entiers positifs : ");
        int a = scan.nextInt(),
            b = scan.nextInt();
        if(estMultipleDe(a, b))
            System.out.println(a + " est multiple de " + b);
        else
            System.out.println(a + " n'est pas multiple de " + b);
    }

}
