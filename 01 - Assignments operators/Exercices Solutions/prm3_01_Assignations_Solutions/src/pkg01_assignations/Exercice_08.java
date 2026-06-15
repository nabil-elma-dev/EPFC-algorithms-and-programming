
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_08 {
    
    /*
    On échange simplement la 1ère et la 3ème (cf. ex 4)
    */

    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 3 valeurs entières");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        int tmp = a;
        a = c;
        c = tmp;
        
        System.out.print("Les voici inversées: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);        
        System.out.print(" ");
        System.out.println(c); 
        
// Ou plus simplement...        
//        System.out.println(a + " " + b + " " + c);
    }

}

