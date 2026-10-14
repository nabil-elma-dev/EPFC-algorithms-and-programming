package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_07 {
    
    //pre : val >= 0
    public static int sommeChiffres(int val){
        if(val < 10)
            //un seul chiffre : la somme est lui-même
            return val;
        //plusieurs chiffres : le dernier + la somme des premiers
        return val % 10 + sommeChiffres(val / 10);
    }
    
        
    public static void main(String[] args) {
        System.out.print("Entrez un nombre positif : ");
        Scanner in = new Scanner(System.in);
        int nb = in.nextInt();
        System.out.println("La somme des chiffres de " + nb + " est " + sommeChiffres(nb));
    }
}
