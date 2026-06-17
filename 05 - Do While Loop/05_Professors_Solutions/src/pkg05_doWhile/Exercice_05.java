package pkg05_doWhile;

import java.util.Scanner;

public class Exercice_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer une suite de nombres positifs (terminer par -1):");
        int somme = 0, cpt = 0;
        int x = scan.nextInt();
        if (x == -1) 
            System.out.println("Pas de nombre, pas de moyenne!");
        else {
            do {
                somme += x;
                ++cpt;
                x = scan.nextInt();
            } while (x != -1);
            System.out.println("Moyenne: " + (double) somme / cpt);
        }
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrer une suite de nombres positifs (terminer par -1):");
//        int somme = 0, cpt = 0;
//        int x;
//        do {
//            x = scan.nextInt();
//            if (x != -1) {
//                somme += x;
//                ++cpt;
//            }
//        } while (x != -1);
//        if (cpt == 0) {
//            System.out.println("Pas de nombre, pas de moyenne!");
//        } else {
//            System.out.println("Moyenne: " + (double) somme / cpt);
//        }
//    }

}
