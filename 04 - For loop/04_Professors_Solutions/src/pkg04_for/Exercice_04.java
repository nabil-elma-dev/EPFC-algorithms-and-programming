package pkg04_for;

import java.util.Scanner;

public class Exercice_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien y aura-t-il de nombres: ");
        int n = scan.nextInt();
        if (n <= 0) 
            System.out.println("Pas de nombre pas de min!!");
        else {
            System.out.print("1er nombre: ");
            int min = scan.nextInt();
            for (int k = 1; k < n; ++k) {
                System.out.print("Nombre suivant: ");
                int x = scan.nextInt();
                if (x < min) {
                    min = x;
                }
            }
            System.out.println("Le minimum est: " + min);
        }
    }
}