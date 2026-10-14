package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_14 {
    //pre : val positif sous format binaire
    public static int binaireVersDecimal(int val){
        if(val == 0)
            return 0;
        return val % 10 + 2 * binaireVersDecimal(val / 10);
    }
    
    public static void main(String[] args) {
        System.out.print("Entrez un nombre binaire : ");
        Scanner in = new Scanner(System.in);
        int nb = in.nextInt();
        System.out.println("Le voilà en décimal : " + binaireVersDecimal(nb));
    }
}
