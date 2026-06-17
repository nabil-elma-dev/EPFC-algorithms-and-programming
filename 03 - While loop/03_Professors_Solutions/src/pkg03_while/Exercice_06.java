package pkg03_while;

import java.util.Scanner;

public class Exercice_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer un nombre entier positif: ");
        int n = scan.nextInt();
        int x = 1;
        while (x * x < n) {
            System.out.print(x + " ");
            ++x;
        }
        System.out.println("");
    }

}
