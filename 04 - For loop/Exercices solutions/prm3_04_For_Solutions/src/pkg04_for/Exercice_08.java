package pkg04_for;

import java.util.Scanner;

public class Exercice_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez la base et l'exposant:");
        int base = scan.nextInt();
        int exp = scan.nextInt();
        if (base == 0) 
            if (exp <= 0) 
                System.out.println("Puissance impossible");
            else 
                System.out.println(0);
        else {
            double res = 1;
            boolean expNeg = false;
            if (exp < 0) {
                exp = -exp;
                expNeg = true;
            }
            for (int i = 0; i < exp; ++i) {
                res *= base;
            }
            if (expNeg) {
                res = 1 / res;
            }
            System.out.println(res);
        }
    }
}
