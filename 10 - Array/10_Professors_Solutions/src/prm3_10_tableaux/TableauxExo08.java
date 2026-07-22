package prm3_10_tableaux;

import eu.epfc.prm3.Array;

public class TableauxExo08 {

//    public static void cyclGauche(Array<Integer> tab) {
//        if (tab.size() > 0) {
//            int tmp = tab.get(0);
//            for(int i = tab.size() - 1; i >= 0; --i) {
//                tmp = tab.set(i, tmp);
//            }
//        }
//    }

    // Ne fait rien si le tableau est vide
    public static void cyclGauche(Array<Integer> tab) {
        if (tab.size() > 0) {
            int tmp = tab.get(0);
            for (int k = 1; k < tab.size(); ++k)
                tab.set(k - 1, tab.get(k));
            tab.set(tab.size() - 1, tmp);
        }
    }

    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.println("Après une permutation cyclique vers la gauche : ");
        cyclGauche(tab);
        System.out.println(tab);
    }

}
