package pkg02_conditions;

import java.util.Scanner;

public class Exercice_01b {

    /*
    5 et 5 donnent vivement mariée
    5 et 2 donnent vive la mariée
    1 et 0 n'affiche rien (le programme se termine "sans rien faire")
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 2) {
            System.out.print("vive");
            if (b < 5) {
                System.out.print(" la");
            } else {
                System.out.print("ment");
            }
            System.out.println(" mariée");
        }

    }

}
