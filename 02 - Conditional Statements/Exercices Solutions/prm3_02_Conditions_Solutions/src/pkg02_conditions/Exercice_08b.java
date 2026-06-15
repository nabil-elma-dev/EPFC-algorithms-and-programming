package pkg02_conditions;

import java.util.Scanner;

public class Exercice_08b {
    
    /*
    Pour tester si x < y et à la fois y < z il faut utiliser les 
    opérateurs logiques.
    La condition devrait être (x < y && y < z)
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if (x < y && y < z)
            System.out.println("Les nombres sont croissants");
    }

}
