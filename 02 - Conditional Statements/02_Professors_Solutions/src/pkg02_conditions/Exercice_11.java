package pkg02_conditions;

import java.util.Scanner;

public class Exercice_11 {
    
    /*
    Première version
    Si le même nombre apparait 3 fois, il est affiché 2 fois. 
    Si le maximum apparait 2 fois, il est affiché 2 fois. 
    */

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrez 3 nombres: ");
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//
//        System.out.print("Les deux plus grands (éventuellemnt répétés) sont: ");
//        if(a > b) { // a doit apparaître
//            System.out.print(a + ", ");
//            if(b > c) // b et pas c
//                System.out.println(b);
//            else
//                System.out.println(c);
//        }
//        else { // c'est donc b
//            System.out.print(b + ", ");
//            if(a > c) // et a, pas c
//                System.out.println(a);
//            else
//                System.out.println(c);
//        }
//    }
    
    /*
    Seconde version
    Plutot que de chercher les deux plus grands, cherchons le plus petit...
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.print("Les deux plus grands (éventuellemnt répétés) sont: ");
        if(a < b && a < c) //a est le plus petit
            System.out.println(b + " " + c);
        else if(b < c)    //a n'est pas le plus petit et b<c -> b est le plus petit
            System.out.println(a + " " + c);
        else              //si c'est pas a ni b, c'est forcément c le plus petit
            System.out.println(a + " " + b);
    }
}
