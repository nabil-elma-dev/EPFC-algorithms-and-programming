package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_10 {
    //pre : val >= 0
    public static int nombreDeDeux(int val){
        if(val == 0)
            return 0;
        if(val % 10 == 2)
            return 1 + nombreDeDeux(val / 10);
        return nombreDeDeux(val / 10);
    }
    
    public static void main(String[] args) {
        System.out.print("Entrez un nombre positif : ");
        Scanner in = new Scanner(System.in);
        int nb = in.nextInt();
        System.out.println("Il y a " + nombreDeDeux(nb) + " '2' dans " + nb);
    }
}
