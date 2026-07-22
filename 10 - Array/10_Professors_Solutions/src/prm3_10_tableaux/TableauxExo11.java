package prm3_10_tableaux;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class TableauxExo11 {
//    public static boolean supprimePos(Array<Integer> tab, int idx) {
//        if (idx < 0 || idx >= tab.size()) {
//            return false;
//        }
//        int tmp = tab.get(tab.size() - 1);
//        for (int k = tab.size() - 2; k >= idx; --k) {
//            tmp = tab.set(k, tmp);
//        }
//        tab.reduceTo(tab.size() - 1);
//        return true;
//    }

    // Ne fait rien si si idx hors limites et renvoie false
    public static boolean supprimePos(Array<Integer> tab, int idx) {
        if (idx < 0 || idx >= tab.size()) {
            return false;
        }
        for (int k = idx + 1; k < tab.size(); ++k) {
            tab.set(k - 1, tab.get(k));
        }
        tab.reduceTo(tab.size() - 1); // Rétrécit de 1. 
        return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.print("En quelle position supprimer une valeur" +
                " (essayez aussi des positions impossibles) : ");
        int pos = scan.nextInt();
        supprimePos(tab, pos);
        System.out.println(tab);
    }

}
