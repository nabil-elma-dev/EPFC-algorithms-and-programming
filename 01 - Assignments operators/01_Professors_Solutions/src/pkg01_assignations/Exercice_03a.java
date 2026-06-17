
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_03a {
    
    /*
    Attend l'entrée de 2 nombres entiers (par exemple 2 et 5)
    Affiche 3, la moyenne tronquée des deux nombres, le résultat de la 
    division entière (de 7 par 2 dans l'exemple)
    car somme et 2 sont des int (entiers)
    */

    public static void main(String[] args) {
        int a, b, somme;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        somme = a;
        b = scan.nextInt();
        somme = somme + b;
        System.out.println(somme / 2);
    }

}

