package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_11 {
    //pre : val >= 0
    public static boolean queDesPairs(int val){
        if(val == 0)
            return true;
        if(val % 2 != 0)
            return false;
        return queDesPairs(val / 10);
    }

    /*
    version plus courte
    public static boolean queDesPairs(int val){
        if(val == 0)
            return true;
        return val % 2 == 0 && queDesPairs(val / 10);
    }*/
        
    public static void main(String[] args) {
        System.out.print("Entrez un nombre positif : ");
        Scanner in = new Scanner(System.in);
        int nb = in.nextInt();
        if(queDesPairs(nb))
            System.out.println("Il n'y a que des chiffres pairs dans " + nb);
        else
            System.out.println("Il y a au moins un chiffre impair dans " + nb);
    }
  
}
