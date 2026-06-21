package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_06 {

    // Renvoie le produit de a et b
    public static int produit(int a, int b) {
        if (b < 0) {
            a = -a;
            b = -b;
        }
        int result = 0;
        for (int k = 0; k < b; ++k) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nombres entiers : ");
        int a = scan.nextInt(), b = scan.nextInt();
        int prod = produit(a, b);
        System.out.println("Le produit est: " + prod);
    }

}
