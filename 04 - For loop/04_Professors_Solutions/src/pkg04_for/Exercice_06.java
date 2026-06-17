package pkg04_for;

import java.util.Scanner;

public class Exercice_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien y aura-t-il de nombres: ");
        int n = scan.nextInt();
        int somme = 0, nbPositifs = 0;
        for (int k = 0; k < n; ++k) {
            System.out.print("Nombre suivant: ");
            int x = scan.nextInt();
            if (x > 0) {
                somme += x;
                ++nbPositifs;
            }
        }
        if (nbPositifs == 0) 
            System.out.println("Pas de positifs -> pas de moyenne");
        else 
            System.out.println("Moyenne: " + (double)somme / nbPositifs);
    }
}
