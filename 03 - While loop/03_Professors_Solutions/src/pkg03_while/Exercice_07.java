package pkg03_while;

import java.util.Scanner;

public class Exercice_07 {

    // Version 1: Si le premier nombre est -1 on affiche juste un message
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer une suite de nombres positifs (terminer par -1):");
        int x = scan.nextInt();
        if (x == -1) {
            System.out.println("Pas de nombre, pas de dernier!");
        } else {
            int dernier = x;
            x = scan.nextInt();
            while (x != -1) {
                dernier = x;
                x = scan.nextInt();
            }
            System.out.println("Le dernier était: " + dernier);
        }
    }
    
//    // Version 2: On oblige l'utilisateur a entrer un nombre avant le -1 
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrer une suite de nombres positifs (terminer par -1):");
//        int x = scan.nextInt();
//        while (x == -1) {
//            System.out.println("Il faut au moins un nombre avant le -1");
//            x = scan.nextInt();
//        }
//        int dernier = x;
//        x = scan.nextInt();
//        while (x != -1) {
//            dernier = x;
//            x = scan.nextInt();
//        }
//        System.out.println("Le dernier était: " + dernier);
//    }
}
