package prm3_10_tableaux;

import eu.epfc.prm3.Array;

public class TableauxExo13 {

    // Solution de l'exercice 12
    public static void supprimeTousAPartirDe(Array<Integer> tab, int val, int pos) {
        int dest = pos;
        for (int orig = pos; orig < tab.size(); ++orig) {
            int x = tab.get(orig);
            if (x != val) {
                tab.set(dest, x);
                ++dest;
            }
        }
        tab.reduceTo(dest);
    }

    // Ne garde que la première apparition de chaque valeur
    public static void supprimeDoubles(Array<Integer> tab) {
        int k = 0;
        while (k < tab.size()) {
            // Supprime toute apparition de v[k] dans la suite (à partir de k + 1)
            supprimeTousAPartirDe(tab, tab.get(k), k + 1);
            ++k;
        }

    }
    
//    // Solution de l'exercice 3
//    // Si pos < 0, commence à chercher en 0
//    // Si pos >= tab.size(), ne trouve rien
//    public static boolean apparaitAPartirDe(int val, Array<Integer> tab, int pos) {
//        int k = Math.max(0, pos);
//        while (k < tab.size() && tab.get(k) != val) {
//            ++k;
//        }
//        return k < tab.size();
//    }
//
//    // Version bis. Ne garde que la dernière apparition de chaque valeur
//    public static void supprimeDoubles(Array<Integer> tab) {
//        int dest = 0;
//        for (int orig = 0; orig < tab.size(); ++orig) {
//            if (!apparaitAPartirDe(tab.get(orig), tab, orig + 1)) {
//                tab.set(dest, tab.get(orig));
//                ++dest;
//            }
//        }
//        tab.reduceTo(dest);
//    }

    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        supprimeDoubles(tab);
        System.out.println(tab);
    }

}
