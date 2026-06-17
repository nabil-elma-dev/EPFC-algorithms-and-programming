package pkg05_doWhile;

import java.util.Scanner;

public class Exercice_01b {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nbs. entiers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 0) 
            do {
                a -= b;
            } while (a >= 0);
        System.out.println(a + " " + b);
    }

}
