package prm3_10_tableaux;

import eu.epfc.prm3.Array;

public class TableauxExo07 {

    public static void echange(Array<Integer> tab, int id1, int id2) {
        int tmp = tab.get(id1);
        tab.set(id1, tab.get(id2));
        tab.set(id2, tmp);
    }

    public static void renverse(Array<Integer> tab) {
        int g = 0,
            d = tab.size() - 1; 
        while (g < d) {
            echange(tab, g, d);
            ++g;
            --d;
        }
    }
    
//    //version se basant sur l'indice et son miroir
//    public static void renverse(Array<Integer> tab) {
//        for(int i = 0; i < tab.size() / 2; ++i)
//            echange(tab, i, tab.size() - 1 - i);
//    }

    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.println("Les mêmes dans l'ordre inverse : ");
        renverse(tab);
        System.out.println(tab);
    }

}
