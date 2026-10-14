package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_13 {
    //pre : val >= 0

    /*
    maxChiffre(5763) = Math.max(3, maxChiffre(576))
                     = Math.max(3, Math.max(6, maxChiffre(57)))
                     = Math.max(3, Math.max(6, Math.max(7, maxChiffre(5))))
                     = Math.max(3, Math.max(6, Math.max(7,5)))
                     = Math.max(3, Math.max(6, 7))
                     = Math.max(3, 7)
                     = 7
     */
    public static int maxChiffre(int val){
	if(val < 10)
            return val;
	return Math.max(val % 10, maxChiffre(val/10));
    }
    
    public static void main(String[] args) {
        System.out.print("Entrez un nombre positif : ");
        Scanner in = new Scanner(System.in);
        int nb = in.nextInt();
        System.out.println("Le plus grand chiffre de " + nb + " est " + maxChiffre(nb));
    }
}
