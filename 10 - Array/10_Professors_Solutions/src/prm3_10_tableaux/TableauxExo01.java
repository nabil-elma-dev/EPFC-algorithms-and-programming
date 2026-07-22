
package prm3_10_tableaux;


import eu.epfc.prm3.Array;

public class TableauxExo01 {
    
//    public static int somme(Array<Integer> tab) {
//        int somme = 0;
//        for(int x : tab)
//            somme += x;
//        return somme;
//    }
//
    // Version alternative qui utilise les indices dans le tableau
    public static int somme(Array<Integer> tab) {
        int somme = 0;
        for(int k = 0; k < tab.size(); ++k)
            somme += tab.get(k);
        return somme;
    }

    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.print("La somme des valeurs du tableau ");
        System.out.println(tab);
        System.out.println("Vaut: " + somme(tab));
    }

}

