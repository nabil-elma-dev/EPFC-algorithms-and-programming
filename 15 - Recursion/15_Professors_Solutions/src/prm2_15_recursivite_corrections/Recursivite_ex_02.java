package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_02 {

    //pre : n > 0
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un nombre strictement positif : ");
        int n = in.nextInt();
        System.out.println("La factorielle de " + n + " est " + fact(n));
    }
}
