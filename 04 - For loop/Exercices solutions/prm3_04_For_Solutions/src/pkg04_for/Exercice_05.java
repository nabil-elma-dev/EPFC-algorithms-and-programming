package pkg04_for;

import java.util.Scanner;

public class Exercice_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien y aura-t-il de nombres: ");
        int n = scan.nextInt();
        int nbp = 0, nbn = 0, nb0 = 0;
        for (int k = 1; k <= n; ++k) {
            System.out.print("Nombre suivant: ");
            int x = scan.nextInt();
            if (x > 0) 
                ++nbp;
            else if (x < 0) 
                ++nbn;
            else 
                ++nb0;
        }
        System.out.println("positifs: " + nbp + "\n" +
                "negatifs: " + nbn + "\n" +
                "nuls : " + nb0);
    }
}

