package pkg02_conditions;

import java.util.Scanner;

public class Exercice_19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez le nombre de jours loués: ");
        int n = scan.nextInt();
        System.out.print("Entrez le nombre de kilomètres parcourus: ");
        int x = scan.nextInt();
        double montant = 250 * n;
        if(x > 50) {
            montant += (x - 50) * 1.25;
            if(x > 500)
                montant += (x - 500) * 0.125;
        }
        System.out.println("Le montant à payer est de " + montant + " euros");
    }
    
}
