package prm3_10_tableaux;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class TableauxExo06 {

    // Lève une exception si id1 ou id2 sont invalides
    public static void echange(Array<Integer> tab, int id1, int id2) {
        int tmp = tab.get(id1);
        tab.set(id1, tab.get(id2));
        tab.set(id2, tmp);
    }

//    // Version moins lisible pour le fun.
//    // Utilise le fait que set renvoie l'ancienne valeur
//    public static void echange(Array<Integer> tab, int id1, int id2) {
//        tab.set(id1, tab.set(id2, tab.get(id1)));
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.println("Indice des éléments à échanger : ");
        int id1 = scan.nextInt();
        int id2 = scan.nextInt();
        echange(tab, id1, id2);
        System.out.println("Après l'échange : ");
        System.out.println(tab);
    }

}
