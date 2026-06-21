package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_02 {

    // Renvoie la moyenne de a et b
    public static double moyenne(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        System.out.println("La moyenne de 5 et 14 est : " + moyenne(5, 14));
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nombres : ");
        double a = scan.nextDouble(), b = scan.nextDouble();
        double moy = moyenne(a, b);
        System.out.println("La moyenne est: " + moy);
    }

}
