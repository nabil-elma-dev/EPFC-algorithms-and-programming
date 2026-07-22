package prm3_10_tableaux;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class TableauxExo04 {

//    // Un réflexe courant (et très raisonnable) est de choisir -1
//    // dans le cas où la valeur n'apparaît pas dans le tableau
//    // Renvoie -1 si pas trouvé
//    public static int posPrem(int val, Array<Integer> tab) {
//        int k = 0;
//        while(k < tab.size() && tab.get(k) != val)
//            ++k;
//        // Nous sommes sûr que: k == tab.size() || tab.get(k) == val;
//        if(k < tab.size()) // Attention: pas if(tab.get(k) == val) !!
//            return k;
//        else
//            return -1;
//    }
//    
////    // Si on veut être sûr que k ne sorte jamais des limites du tableau
////    // 0 <= k < tab.size()
////    // Renvoie -1 si pas trouvé
////    public static int posPrem(int val, Array<Integer> tab) {
////        int k = 0;
////        while(k < tab.size() - 1 && tab.get(k) != val) // Remarquez le - 1
////            ++k;
////        // Nous sommes sûr que: k < tab.size(); // avantage: k reste dans les limites
////        // Nous sommes sûr que: k == tab.size() - 1 || tab.get(k) == val;
////        if(tab.get(k) == val) // Attention: pas if(k < tab.size() - 1) !!
////            return k;
////        else
////            return -1;
////    }
//    
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
//        System.out.println(tab);
//        System.out.print("Quelle valeur chercher ? : ");
//        int val = scan.nextInt();
//        int pos = posPrem(val, tab);
//        if(pos != -1)
//            System.out.println(val + " apparait dans le tableau à l'indice " + pos);
//        else
//            System.out.println(val + " n'apparait pas dans le tableau");
//    }

    // Renvoie tab.size() si pas trouvé. C'est le plus simple !
    public static int posPrem(int val, Array<Integer> tab) {
        int k = 0;
        while (k < tab.size() && tab.get(k) != val) {
            ++k;
        }
        // Nous sommes sûr que: k == tab.size() || tab.get(k) == val;
        return k;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.print("Quelle valeur chercher ? : ");
        int val = scan.nextInt();
        int pos = posPrem(val, tab);
        if (pos != tab.size()) {
            System.out.println(val + " apparait dans le tableau à l'indice " + pos);
        } else {
            System.out.println(val + " n'apparait pas dans le tableau");
        }
    }

}
