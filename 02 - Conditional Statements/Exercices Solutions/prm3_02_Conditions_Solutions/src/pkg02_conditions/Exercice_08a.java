package pkg02_conditions;

import java.util.Scanner;

public class Exercice_08a {
    
    /*
    Le programmeur voulait probablement écrire x == 0
    Il y a confusion entre assignation (=) et test d'égalité (==)
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x == 0) {
            System.out.println("x est nul");
        } else {
            System.out.println("x est non nul");
        }
    }

}
