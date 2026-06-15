package pkg03_while;

import java.util.Scanner;

public class Exercice_01e {
    
    /*
    Ce programme est très simple à priori.
    Si le nombre est pair, il est divisé par 2 (et donc diminue)
    S'il est impair, il augmente (est multiplié par 3 et additionné de 1) et
    redevient forcément pair ce qui l'amènera à diminuer la fois suivante.
    Pourtant, à l'heure actuelle, personne n'est jamais arrivé à prouver
    que ce programme se termine pour toute valeur de a.
    Cela montre qu'il peut être très difficile d'être sûr qu'une boucle
    se termine toujours et donc qu'un programme sera correct.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un entier (positif): ");
        int a = scan.nextInt(), k = 0;
        while (a > 1) {
            ++k;
            if (a % 2 == 0) 
                a /= 2;
            else 
                a = 3 * a + 1;
        }
        System.out.println("Bouclé " + k + " fois");
    }

}
