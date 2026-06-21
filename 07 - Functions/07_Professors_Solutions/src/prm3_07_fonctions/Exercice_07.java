package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_07 {

    // Renvoie a exposant b
    // Precondition: b doit etre positif ou nul
    public static int exposant(int a, int b) {
        int result = 1;
        for (int k = 0; k < b; ++k) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer deux entiers (le deuxième doit être positif ou nul) : ");
        int a = scan.nextInt(),
            b = scan.nextInt();
        while(b < 0) {
            System.out.print("Ré-entrer le deuxième qui doit être positif ou nul : ");
            b = scan.nextInt();
        }
        System.out.println(a + " exposant " + b + " donne " + exposant(a, b));
    }

}
