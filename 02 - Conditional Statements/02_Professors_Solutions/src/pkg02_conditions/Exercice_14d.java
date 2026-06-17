package pkg02_conditions;

import java.util.Scanner;

public class Exercice_14d {

    /*
    L'utilisateur doit entrer un entier. Si cet entier est
     - plus grand que 0, l'ordinateur  affiche le message "C'est bien"
     - 0, l'ordinateur n'affiche rien
     - plus petit que 0, l'ordinateur affiche le message "C'est "nul""
    Remarquez comme la simple absence d'accolades change le comportement 
    du programme par rapport au précédent
    */

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    if(a != 0)
    if(a > 0)
    System.out.println("C'est bien");     // a > 0
    else
    System.out.println("C'est \"nul\"");  // a < 0
    }

}
