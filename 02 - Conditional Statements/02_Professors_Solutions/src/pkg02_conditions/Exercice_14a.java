package pkg02_conditions;

import java.util.Scanner;

public class Exercice_14a {
    
    /*
    L'utilisateur doit entrer un entier. Si cet entier est
    3 ou plus, l'ordinateur affiche un 3
    2, l'ordinateur affiche un 2
    1, l'ordinateur affiche un 1
    0 ou moins, l'ordinateur affiche le message "Erreur"
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0) 
            if (a > 1) 
                if (a > 2) 
                    System.out.println(3);   // a >= 3
                else 
                    System.out.println(2);   // a == 2           
            else 
                System.out.println(1);       // a == 1     
        else 
            System.out.println("Erreur");    // a <= 0    
    }

}
