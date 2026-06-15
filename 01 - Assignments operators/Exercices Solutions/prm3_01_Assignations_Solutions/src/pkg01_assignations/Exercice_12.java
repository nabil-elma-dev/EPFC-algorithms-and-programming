
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_12 {
    
    /*
    Les calculs sont faits en minutes en comptant que chaque heure dure 60 minutes
    L'algèbre modulo 60 (la division entière par 60) permet de retrouver 
    les heures et les minutes. 
    Par exemple 200 minutes sont équivalentes à 3 heures (200 / 60 -> 3) et
    20 minutes (il reste 20 lors de la division)
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Début de l'évènement (en h et m):");
        int hDebut = scan.nextInt();
        int mDebut = scan.nextInt();
        System.out.println("Fin de l'évènement (en h et m):");
        int hFin = scan.nextInt();
        int mFin = scan.nextInt();
        int debutEnMinutes = 60 * hDebut + mDebut,
            finEnMinutes   = 60 * hFin + mFin;
        int duree = finEnMinutes - debutEnMinutes;
        System.out.print("Durée de l'évènement : ");
        System.out.print(duree / 60);
        System.out.print("h");
        System.out.println(duree % 60);
    }
    
}

