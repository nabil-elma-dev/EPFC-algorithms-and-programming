package pkg02_conditions;

import java.util.Scanner;

public class Exercice_02a {

    /*
    Le programme a été indenté. Certaines accolades ont aussi été ajoutées sans
    que cela ne change le comportement du programme. En cas d'imbrication, ces
    accolades peuvent rendre le programme plus lisible et maintenable.
    Si a <= 0 le programme affiche Peu
    Si a vaut 1 (avec a entier et a > 0 et <= 1, il n'y a pas d'autre
    possibilité) le programme affiche Un
    Dans tous les autres cas, le programme affiche Beaucoup
    Ce programme n'affiche jamais Zut car il est évidemment impossible qu'un
    nombre ne soit, à la fois, pas plus grand que 0 et 
    tout de même plus grand que 1 
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0) {
            if (a > 1) {
                System.out.println("Beaucoup");
            } else {
                System.out.println("Un");
            }
        } else if (a > 1) {
            System.out.print("Zut");
        } else {
            System.out.println("Peu");
        }
    }

//    /*
//    Ce programme est équivalent mais plus simple car il n'envisage pas 
//    inutilement la situation impossible
//    */
//    
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        if (a > 0) {
//            if (a > 1) {
//                System.out.println("Beaucoup");
//            } else {
//                System.out.println("Un");
//            }
//        } else {
//            System.out.println("Peu");
//        }
//    }

}
