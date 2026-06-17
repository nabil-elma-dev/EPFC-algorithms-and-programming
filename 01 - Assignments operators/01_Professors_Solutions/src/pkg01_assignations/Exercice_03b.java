
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_03b {
    
    /*
    Attend l'entrée de 2 nombres entiers (par exemple 2 et 5)
    Affiche 3.5, la moyenne des deux nombres.
    Le résultat est correct car 2.0 est de type double et donc la division
    est "exacte"
    */

    public static void main(String[] args) {
        int a, b, somme;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        somme = a;
        b = scan.nextInt();
        somme = somme + b;
        System.out.println(somme / 2.0);
    }

}

