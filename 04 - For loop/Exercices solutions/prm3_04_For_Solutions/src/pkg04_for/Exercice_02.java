package pkg04_for;

import java.util.Scanner;

public class Exercice_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer un nombre: ");
        int x = scan.nextInt();
        for (int k = 1; k <= 10; ++k) {
            System.out.println(k + " x " + x + " = " + k * x);
        }
    }
}
