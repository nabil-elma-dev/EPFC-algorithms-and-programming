
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_13 {
    /*
    L'énoncé ne dit pas s'il s'agit de nombres entiers ou flottant.
    Par généralité nous choisissons des flottants.
    Tous les nombres entrés seront sommés dans une variable (somme)
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 4 nombres ");
        double somme = scan.nextDouble(); // Contiendra la somme de tous
        somme += scan.nextDouble();
        somme += scan.nextDouble();
        somme += scan.nextDouble();
        System.out.println("La somme est: " + somme);
    }

}

