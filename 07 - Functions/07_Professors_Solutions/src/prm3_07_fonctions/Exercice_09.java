package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_09 {

    public static int factorielle(int n) {
        int result = 1;
        for (int k = 1; k <= n; ++k) {
            result *= k;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer 1 nombre entier positif : ");
        int n = scan.nextInt();
        System.out.println("La factorielle de " + n + " vaut " + factorielle(n));
    }

}
