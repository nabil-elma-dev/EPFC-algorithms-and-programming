
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_06 {
    
    /*
    L'énoncé ne dit pas si les valeurs sont entières ou flotantes (réelles)
    La moyenne, par contre devrait l'être en général
    */

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 valeurs entières");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.print("La moyenne est: ");
        System.out.println((a + b) / 2.0); // 2.0 garantit une division exacte
    }
    
}

