package pkg05_doWhile;

import java.util.Scanner;

public class Exercice_01a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nbs. entiers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        do {
            a *= 2;
            b += a;
        } while (b <= 20);
        System.out.println(a + " " + b);
    }

}
