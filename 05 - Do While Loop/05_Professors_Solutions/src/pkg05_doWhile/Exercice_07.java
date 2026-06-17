package pkg05_doWhile;

import java.util.Scanner;

public class Exercice_07 {
    
    /*
    Puisqu'il faut au moins lire un nombre avant le -1 pour avoir le dernier,
    cette solution est légèrement plus simple que la solution correspondante
    utilisant un while.
    En effet le do...while se différencie justement du while car au moins une 
    itération est effectuée.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer une suite de nombres positifs (terminer par -1):");
        int x = scan.nextInt();
        if (x == -1) {
            System.out.println("Pas de nombre, pas de dernier!");
        } else {
            int dernier;
            do {
                dernier = x;
                x = scan.nextInt();
            } while (x != -1);
            System.out.println("Le dernier était: " + dernier);
        }
    }

}
