
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_09 {
    
    /*
    On échange simplement la 1ère et la 4ème ainsi que la 2ème et la 3ème
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
        a = d;
        d = tmp;
        
        tmp = b;
        b = c;
        c = tmp;
        
        System.out.print("Les voici inversées: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);        
        System.out.print(" ");
        System.out.print(c);        
        System.out.print(" ");
        System.out.println(d);        
    }

}

