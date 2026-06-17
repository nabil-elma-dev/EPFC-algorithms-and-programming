package pkg03_while;

import java.util.Scanner;

public class Exercice_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer un nombre entier positif: ");
        int max = scan.nextInt();
        int n = 1, s = 0;
        while (s + n < max) {
            s += n;
            ++n;
        }
        System.out.println("La somme des entiers de 1 a " + (n - 1)
                + " reste inférieure a " + max);
    }

}
