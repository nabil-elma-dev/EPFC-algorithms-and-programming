package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_05 {
    
    //pre : a >= 0 et n >= 0
    //beaucoup plus efficace.
    //va faire de l'ordre de log2n appels (log2 1024 == 10)
    public static int exp_rapide(int a, int n) {
        if(n == 0)
          return 1;
        if(n % 2 == 0)
          return exp_rapide(a * a, n / 2);
        return a * exp_rapide(a, n - 1);
    }
    /*
    exp(3,5) = 3 * exp(3,4)
             = 3 * exp(9,2)
             = 3 * exp(81,1)
             = 3 * 81 * exp(81,0)
             = 3 * 81 * 1
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez la base (positive) : ");
        int base = in.nextInt();
        System.out.print("Entrez l'exposant (positif) : ");
        int exp = in.nextInt();
        System.out.println(base + " exposant " + exp + " = " + exp_rapide(base, exp));
    }
}
