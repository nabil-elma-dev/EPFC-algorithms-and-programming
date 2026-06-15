package pkg02_conditions;

import java.util.Scanner;

public class Exercice_16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez une année (en 4 chiffres): ");
        int an = scan.nextInt();
        if(an % 4 == 0 && an % 100 != 0 || an % 400 == 0) 
            System.out.println(an + " est une année bissextile"); 
        
        else 
            System.out.println(an + " n'est pas une année bissextile"); 
    }
    

}
