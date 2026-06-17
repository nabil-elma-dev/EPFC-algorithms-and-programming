package pkg02_conditions;

import java.util.Scanner;

public class Exercice_10 {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrez 3 nombres: ");
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//
//        // On va faire "remonter" le plus grand (l'amener dans c)
//        if (a > b) {      // a est plus grand que b, il "remonte"
//            int tmp = a;  // On échange a et b
//            a = b;
//            b = tmp;
//        }
//        if(b > c) {       // b est plus grand que c, il "remonte"
//            int tmp = b;  // On échange b et c
//            b = c;
//            c = tmp;
//        }
//        // Maintenant, c est le plus grand. Mais il faut revoir pour a et b
//        if (a > b) {      // a est plus grand que b, il "remonte"
//            int tmp = a;  // On échange a et b
//            a = b;
//            b = tmp;
//        }
//        System.out.println("Dans l'ordre: " + a + ", " + b + ", " + c);
//    }
    
    
    /* Version alternative */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a < b && a < c) { // a est le plus petit des 3
            if(b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if(b < c) {  // a n'est pas le plus petit et b est inférieur à c
                            // b est donc le plus petit
            if(a < c) {   
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {            // a n'est pas le plus petit. b non plus.
                            // c est donc le plus petit
            if(a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }              
        }
    }
    
}
