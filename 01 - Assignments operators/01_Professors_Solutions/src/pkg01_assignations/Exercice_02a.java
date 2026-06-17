
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_02a {
    
    /*
    Le programme attend que l'utilisateur tape deux nombres au clavier
    (dans la fenêtre console)
    Les nombres tapés sont affichés en cours de route (par exemple 2 6)
    L'utilisateur doit séparer les deux nombres, soit par un espace,
    soit par un <Enter>
    Puis le programme affiche 4 10
    */

    public static void main(String[] args) {
        int a, b; 
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        a = 2 * a; 
        b = s.nextInt();
        b += a;
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
    }

}

