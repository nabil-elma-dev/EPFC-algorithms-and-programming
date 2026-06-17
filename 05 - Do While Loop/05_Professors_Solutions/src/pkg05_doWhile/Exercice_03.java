package pkg05_doWhile;

import java.util.Scanner;

public class Exercice_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somme = 0;
        int n;
        do {
            System.out.print("Combien y aura-t-il de nombres " + 
                    "(vous devez entrer une valeur positive): ");
            n = scan.nextInt();
        } while (n <= 0);
        int k = 0;
        do {
            System.out.print("Nombre suivant: ");
            int x = scan.nextInt();
            somme += x;
            ++k;
        } while (k < n);
        System.out.println("Moyenne: " + (double) somme / n);
    }

}
