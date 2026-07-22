
package prm3_10_tableaux;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class TableauxExo03 {
    
    public static boolean apparait(int val, Array<Integer> tab) {
        int k = 0;
        while(k < tab.size() && tab.get(k) != val)
            ++k;
        // Nous sommes sûr que: k == tab.size() || tab.get(k) == val;
        return k < tab.size();
    }
    
//    public static boolean apparait(int val, Array<Integer> tab) {
//        return apparaitAPartirDe(val, tab, 0);
//    }
    
    // Si pos < 0, commence à chercher en 0
    // Si pos >= tab.size(), ne trouve rien
    public static boolean apparaitAPartirDe(int val, Array<Integer> tab, int pos) {
        int k = Math.max(0, pos);
        while(k < tab.size() && tab.get(k) != val)
            ++k;
        // Nous sommes sûr que: k == tab.size() || tab.get(k) == val;
        return k < tab.size();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array<Integer> tab = new Array<>(4, 7, 5, 2, 4, 3, 2, 3);
        System.out.println(tab);
        System.out.print("Quelle valeur chercher ? : ");
        int val = scan.nextInt();
        if(apparait(val, tab))
            System.out.println(val + " apparait dans le tableau");
        else
            System.out.println(val + " n'apparait pas dans le tableau");
        
        // Maintenant on cherche 5
        val = 5;
        if(apparait(val, tab))
            System.out.println(val + " apparait dans le tableau");
        else
            System.out.println(val + " n'apparait pas dans le tableau");
        if(apparaitAPartirDe(val, tab, 3))
            System.out.println(val + " apparait dans la fin du tableau en commençant en position 3");
        else
            System.out.println(val + " n'apparait pas dans le tableau au dela de la position 3");
        
    }

}

