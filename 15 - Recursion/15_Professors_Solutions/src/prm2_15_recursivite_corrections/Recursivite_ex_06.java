package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_06 {

    //pre : val >= 0
    public static int nbChiffres(int val) {
        if (val < 10)
            return 1;
        return 1 + nbChiffres(val / 10);
    }
    
    public static void main(String[] args) {
        System.out.print("Entrez un nombre positif : ");
        Scanner in = new Scanner(System.in);
        int nb = in.nextInt();
        System.out.println("Il y a " + nbChiffres(nb) + " chiffres dans " + nb);
    }
}
