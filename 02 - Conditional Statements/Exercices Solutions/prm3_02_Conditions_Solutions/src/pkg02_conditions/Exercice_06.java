
package pkg02_conditions;

import java.util.Scanner;

public class Exercice_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre de 1 à 10: ");
        double x = scan.nextDouble();
        if(x >= 1)
            if(x <= 10)
                System.out.println("OK");
            else
                System.out.println("NOT OK");
        else
            System.out.println("NOT OK");
    }
    
    /*
    Une "meilleure" solution
    On utilise l'opérateur logique && (et) pour regrouper deux conditions en une
    */
    
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Entrez un nombre de 1 à 10: ");
//        double x = scan.nextDouble();
//        if(x >= 1 && x <= 10)
//            System.out.println("OK");
//        else
//            System.out.println("NOT OK");
//    }
//    
}

