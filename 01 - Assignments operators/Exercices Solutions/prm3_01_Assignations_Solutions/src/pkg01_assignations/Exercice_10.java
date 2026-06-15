
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_10 {
    
    /*
    On préserve la dernière puis (en "reculant") on décale les valeurs
    vers la droite
    */

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 4 valeurs entières");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        
        int tmp = d;
        d = c;
        c = b;
        b = a;
        a = tmp;
        
        System.out.print("Les voici permutées vers la droite: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);        
        System.out.print(" ");
        System.out.print(c);        
        System.out.print(" ");
        System.out.println(d);        
    }

}

