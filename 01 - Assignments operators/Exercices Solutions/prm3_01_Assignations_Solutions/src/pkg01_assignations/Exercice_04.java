
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_04 {
    
    /*
    Il suffit d'utiliser une variable supplémentaire pour contenir
    momentanément la valeur de la variable qu'on remplace par l'autre
    */

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 valeurs entières");
        a = scan.nextInt();
        b = scan.nextInt();
        
        int tmp = a;
        a = b;
        b = tmp;
        
        System.out.print("Les voici inversées: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);        
    }

}

