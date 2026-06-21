package prm2_07_fonctions;

import java.util.Scanner;

public class Exercice_03 {

    // Renvoie le maximum de a et b
    public static double max2(double a, double b) {
        double max = a;
        if(b > a) max = b;
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nombres : ");
        double a = scan.nextDouble(), b = scan.nextDouble();
        double max = max2(a, b);
        System.out.println("Le plus grand est: " + max);
    }

}
