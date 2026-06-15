
package pkg02_conditions;

import java.util.Scanner;

public class Exercice_01a {
    
    /*
    Si le premier nombre entré par l'utilisateur est supérieur au deuxième,
    le programme affiche la valeur de ce 1er nombre plus 2, sinon, il affiche
    la somme des deux nombres
    7 et 3 donnent 9 (7 + 2)
    3 et 7 donnent 10 (3 + 7)
    5 et 5 donnent 10 (5 + 5)
    5 et 2 donnent 7 (5 + 2). Dans ce cas, b valait déjà 2 avec d'être "changé"
    pour recevoir 2
    1 et 0 donnent 3 (1 + 2)
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > b)
            b = 2;
        System.out.println(a + b);

    }

}

