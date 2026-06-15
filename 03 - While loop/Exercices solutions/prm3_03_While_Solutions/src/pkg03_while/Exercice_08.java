package pkg03_while;

import java.util.Scanner;

public class Exercice_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer une suite de nombres positifs (terminer par -1):");
        int x = scan.nextInt();
        if (x == -1) {
            System.out.println("La suite est vide");
        } else {
            int premier = x, dernier = x;
            x = scan.nextInt();
            while (x != -1) {
                dernier = x;
                x = scan.nextInt();
            }
            if (premier < dernier) {
                System.out.println("Le premier est inférieur au dernier");
            } else if (premier == dernier) {
                System.out.println("Le premier est egal au dernier");
            } else {
                System.out.println("Le premier est supérieur au dernier");
            }
        }
    }

}
