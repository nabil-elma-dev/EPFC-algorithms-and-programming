
package pkg02_conditions;

import java.util.Scanner;

public class Exercice_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez deux nombres: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if(a < b) 
            System.out.println("La différence est: " + (b - a));
        else
            System.out.println("La différence est: " + (a - b));
    }

}

