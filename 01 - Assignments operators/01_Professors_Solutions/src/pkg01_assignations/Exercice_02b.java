
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_02b {
    
    /*
    Le programme fonctionne d'exactement la même façon que le précédent (2a)
    En effet, les seules lignes inversées
        b = s.nextInt();
        a = 2 * a; 
    sont indépendantes l'unes de l'autre
    */

    public static void main(String[] args) {
        int a, b; 
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        a = 2 * a; 
        b += a;
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
    }

}

