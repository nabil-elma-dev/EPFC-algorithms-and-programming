package pkg03_while;

import java.util.Scanner;

public class Exercice_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somme = 0;
        System.out.print("Combien y aura-t-il de nombres: ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println("Vous devez entrer un nombre positif");
            System.out.print("Combien y aura-t-il de nombres: ");
            n = scan.nextInt();
        }
        int k = 1;
        while (k <= n) {
            System.out.print("Nombre suivant: ");
            int x = scan.nextInt();
            somme += x;
            ++k;
        }
        System.out.println("Moyenne: " + (double) somme / n);
    }

}
