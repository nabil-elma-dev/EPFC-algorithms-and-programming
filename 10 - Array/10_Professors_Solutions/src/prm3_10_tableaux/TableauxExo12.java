package prm3_10_tableaux;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class TableauxExo12 {

    public static void supprimeTous(Array<Integer> tab, int val) {
        int dest = 0;
        for (int orig = 0; orig < tab.size(); ++orig) {
            int x = tab.get(orig);
            if (x != val) {
                tab.set(dest, x);
                ++dest;
            }
        }
        tab.reduceTo(dest);
    }
    
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
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array<Integer> tab = new Array<>(4, 3, 7, 2, 5, 4, 4, 4, 4, 3, 5, 4);
        System.out.println(tab);
        System.out.print("Quelle valeur supprimer? : ");
        int val = scan.nextInt();
        supprimeTous(tab, val);
        System.out.println(tab);
    }

}
