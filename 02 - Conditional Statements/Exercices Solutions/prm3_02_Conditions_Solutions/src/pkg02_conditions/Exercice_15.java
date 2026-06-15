package pkg02_conditions;

import java.util.Scanner;

public class Exercice_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a > 0) { 
            if(a == 1) 
                System.out.println("a vaut 1"); 
        } 
        else 
            System.out.println("a est inferieur ou egal à 0");     
    }
    
//    /*
//    Solution alternative
//    */
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        if(a == 1) { 
//            System.out.println("a vaut 1"); 
//        } 
//        else if (a <= 0) 
//            System.out.println("a est inferieur ou egal à 0");     
//    }

}
