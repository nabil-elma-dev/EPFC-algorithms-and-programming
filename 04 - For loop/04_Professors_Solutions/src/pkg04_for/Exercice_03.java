package pkg04_for;

import java.util.Scanner;

public class Exercice_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien y aura-t-il de nombres: ");
        int n = scan.nextInt();
        if (n <= 0) 
            System.out.println("Pas de nombre, pas de moyenne!");
        else {
            int somme = 0;
            for (int k = 1; k <= n; ++k) {
                System.out.print("Nombre suivant: ");
                somme += scan.nextInt();
            }
            System.out.println("Moyenne: " + (double) somme / n);
        }
    }
}
