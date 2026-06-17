package pkg02_conditions;

import java.util.Scanner;

public class Exercice_18_bis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez deux nombres: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 0 && b >= 0 || 
            a == 0 && b > 0 || 
            a > 0 && b < 0 && a > -b ||
            a < 0 && b > 0 && -a < b)
            System.out.println("Leur somme est positive"); 
        else if (a < 0 && b <= 0 || 
            a == 0 && b < 0 || 
            a > 0 && b < 0 && a < -b ||
            a < 0 && b > 0 && -a > b)
            System.out.println("Leur somme est négative"); 
        else
            System.out.println("Leur somme est nulle");
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez deux nombres: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > 0 && b > 0 || 
                a > 0 && b < 0 && a > -b || 
                a < 0 && b > 0 && -a < b)
            System.out.println("Leur somme est positive"); 
        else if(a < 0 && b < 0 || 
                a > 0 && b < 0 && a < -b || 
                a < 0 && b > 0 && -a > b) 
            System.out.println("Leur somme est négative"); 
        else
            System.out.println("Leur somme est nulle");
    }
    
//    /*
//    Ou, beaucoup plus simple... :-)
//    */
//    
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrez deux nombres: ");
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        if(a > -b)
//            System.out.println("Leur somme est positive"); 
//        else if(a < -b) 
//            System.out.println("Leur somme est négative"); 
//        else
//            System.out.println("Leur somme est nulle");
//    }
    
}
