package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_04 {
    
    //pre : a > 0 et n >= 0
    //peu efficace : pour calculer a^n, fait de l'ordre de n appels.
    public static int exp(int a, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return a * exp(a, n - 1);
        return exp_aux(a, n, 1);
    }

    public static int exp_aux(int a, int n, int res) {
        if (n == 0)
            return res;
        return exp_aux(a, n - 1, a * res);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez la base (positive) : ");
        int base = in.nextInt();
        System.out.print("Entrez l'exposant (positif) : ");
        int exp = in.nextInt();
        System.out.println(base + " exposant " + exp + " = " + exp(base, exp));
    }
}
