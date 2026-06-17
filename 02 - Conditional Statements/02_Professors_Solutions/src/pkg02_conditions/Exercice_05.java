
package pkg02_conditions;

import java.util.Scanner;

public class Exercice_05 {
    
    /*
    Remarquez l'indentation du else if qui permet de ne pas décaler trop vers
    la droite les cas multiple
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez deux nombres: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if(a > b) 
            System.out.println("Le premier est plus grand que le deuxième");
        else if(a == b)
            System.out.println("Les deux nombres sont égaux");
        else
            System.out.println("Le premier est plus petit que le deuxième");
    }

}

