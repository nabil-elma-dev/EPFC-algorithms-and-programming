
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_11 {
    
    /*
    On préserve la première puis (en "avancant") on décale les valeurs
    vers la gauche
    */

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 4 valeurs entières");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        
        int tmp = a;
        a = b;
        b = c;
        c = d;
        d = tmp;
        
        System.out.print("Les voici permutées vers la gauche: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);        
        System.out.print(" ");
        System.out.print(c);        
        System.out.print(" ");
        System.out.println(d);        
    }

}

