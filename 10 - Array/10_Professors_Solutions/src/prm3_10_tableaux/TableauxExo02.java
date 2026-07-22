
package prm3_10_tableaux;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class TableauxExo02 {

    public static int somme(Array<Integer> tab) {
        int somme = 0;
        for(int x : tab)
            somme += x;
        return somme;
    }
    
    // Provoque une exception si tab est vide
    public static double moyenne(Array<Integer> tab) {
        if(tab.size() == 0)
            throw new RuntimeException("Erreur: moyenne d'un tableau vide");        
        return (double) somme(tab) / tab.size();
    }

    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.print("La moyenne des valeurs du tableau ");
        System.out.println(tab);
        System.out.println("Vaut: " + moyenne(tab));
        
        Array<Integer> tab2 = new Array<>();  // Un tableau vide
        System.out.println();
        System.out.println("La moyenne d'un tableau vide provoque une erreur");
        System.out.print("Enfoncez la touche <Enter>... ");
        new Scanner(System.in).nextLine();
        System.out.println(moyenne(tab2));
    }

}

