package prm3_10_tableaux;

import eu.epfc.prm3.Array;

public class TableauxExo09 {

//    public static void cyclDroite(Array<Integer> tab) {
//        if(tab.size() > 0) {
//            int tmp = tab.get(tab.size() - 1);
//            for (int i = 0; i < tab.size(); ++i) {
//                tmp = tab.set(i, tmp);
//            }
//        }
//    }

    // Ne fait rien si le tableau est vide
    public static void cyclDroite(Array<Integer> tab) {
        if (tab.size() > 0) {
            int tmp = tab.get(tab.size() - 1);
            for (int k = tab.size() - 1; k > 0; --k) 
                tab.set(k, tab.get(k - 1));
            tab.set(0, tmp);
        }
    }

    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.println("Après une permutation cyclique vers la droite : ");
        cyclDroite(tab);
        System.out.println(tab);
    }

}
