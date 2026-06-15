
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_02c {
    
    /*
    Cette fois, par contre l'ordre des lignes a rendu le programme incorrect
    car b n'a pas de valeur quand on cherche à lui ajouter celle de a
    */

    public static void main(String[] args) {
        int a, b; 
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        a = 2 * a; 
        b += a;
        b = s.nextInt();
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
    }

}

