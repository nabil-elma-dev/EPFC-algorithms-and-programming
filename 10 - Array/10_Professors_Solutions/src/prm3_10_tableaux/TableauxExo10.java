package prm3_10_tableaux;

import eu.epfc.prm3.Array;

import java.util.Scanner;

public class TableauxExo10 {
//    public static boolean ajouterPos(Array<Integer> tab, int val, int idx) {
//        if (idx < 0 || idx > tab.size()) {
//            return false;
//        }
//        for (int k = idx; k < tab.size(); ++k) {
//            val = tab.set(k, val);
//        }
//        tab.add(val);
//        return true;
//    }

    // Ne fait rien si si idx hors limites et renvoie false
    public static boolean ajouterPos(Array<Integer> tab, int val, int idx) {
        if (idx < 0 || idx > tab.size()) {
            return false;
        }
        tab.add(0); // La valeur ne compte pas. 
        for (int k = tab.size() - 1; k > idx; --k) {
            tab.set(k, tab.get(k - 1));
        }
        tab.set(idx, val);
        return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.print("Nous allons ajouter la valeur 9.\n" +
                "En quelle position ajouter une valeur" +
                " (essayez aussi des positions impossibles) : ");
        int pos = scan.nextInt();
        ajouterPos(tab, 9, pos);
        System.out.println(tab);
    }

}
