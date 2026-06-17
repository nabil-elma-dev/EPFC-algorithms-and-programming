
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_05 {
    
    /*
    Cette solution affiche simplement la valeur de l'expression a + b
    */

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 valeurs entières");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.print("La somme est: ");
        System.out.println(a + b);
    }
    
//    /*
//    Cette solution utilise une nouvelle variable pour mémoriser la somme
//    au cas ou la valeur de la somme serait utile pour d'autres calculs ultérieurs
//    */
//
//    public static void main(String[] args) {
//        int a, b;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrer 2 valeurs entières");
//        a = scan.nextInt();
//        b = scan.nextInt();
//        int somme = a + b;
//        System.out.print("La somme est: ");
//        System.out.println(somme);
//    }

}

