package prm3_10_tableaux;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class TableauxExo05 {

//    // Renvoie tab.size() si pas trouvé.
//    public static int posDerniere(int val, Array<Integer> tab) {
//        int pos = tab.size();
//        for(int k = 0; k < tab.size(); ++k)
//            if(tab.get(k) == val)
//                pos = k;
//        return pos;
//    }
    
    
//    // Solution moins simple mais plus rapide que la précédente
    public static int posDerniere(int val, Array<Integer> tab) {
        int pos = tab.size() - 1;
        while (pos >= 0 && tab.get(pos) != val) {
            --pos;
        }
        if (pos == -1) {
            pos = tab.size();
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.print("Quelle valeur chercher ? : ");
        int val = scan.nextInt();
        int pos = posDerniere(val, tab);
        if (pos != tab.size()) {
            System.out.println("La dernière apparition de " + val +
                    " est à l'indice " + pos);
        } else {
            System.out.println(val + " n'apparait pas dans le tableau");
        }
    }

}
