package pkg02_conditions;

import java.util.Scanner;

public class Exercice_17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez deux nombres: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a == 0 || b == 0)
            System.out.println("Leur produit est nul"); 
        else if(a > 0 && b > 0 || a < 0 && b < 0) 
            System.out.println("Leur produit est positif"); 
        else 
            System.out.println("Leur produit est négatif"); 
    }
    

}
