package pkg04_for;

import java.util.Scanner;

public class Exercice_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer un nombre positif: ");
        int n = scan.nextInt();
        if (n <= 0) 
            System.out.println("Erreur");
        else {
            int fact = 1;
            for (int k = 1; k <= n; ++k) {
                fact *= k;
            }
            System.out.println("La factorielle est: " + fact);
        }
    }
}