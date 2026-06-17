package pkg03_while;

import java.util.Scanner;

public class Exercice_01f {
    
    /*
    Ce programme est assez semblable au précédent.
    Si le nombre est impair, il est aussi multiplié par 3 et additionné de 1
    (ce qui le rend donc pair). Mais il est immédiatement divisé par 2.
    
    Pour ce programme ci, par contre, il est possible de prouver qu'il
    se termine après un nombre fini de tours de boucle.
    
    La preuve est complexe et peut être ignorée. 
    Elle n'est fournie ci-dessous que pour les curieux. 
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un entier (positif): ");
        int a = scan.nextInt(), k = 0;
        while (a % 2 == 1) {
            ++k;
            a = (3 * a + 1) / 2;
        }
        System.out.println("Bouclé " + k + " fois");
    }
    
    /*
    Preuve que le programme se termine (cours d'Algorithmique théorique)
    Le raisonnement est le suivant et se base sur l'écriture binaire:
    La boucle continue si a est impair
    Si a vaut 1, la boucle s'arrête immédiatement.
    Sinon, tout a impair s'écrit forcément en binaire avec un certain nombre de 1 
    à droite (4 dans l'exemple ci-dessous). 
    Par exemple 175 s'écrit 10101111 avec 4 1 à droite
    Ce nombre de 1 à droite peut être appelé "l'imparité" de a: Il mesure 
    combien de fois a peut être divisé par deux en restant impair.
    175 / 2 -> 87 (1010111)    est toujours impair
    87  / 2 -> 43  (101011)    est toujours impair
    43  / 2 -> 21   (10101)    est toujours impair
    21  / 2 -> 10    (1010)    est pair. On a donc divisé 4 fois
    
    Les x et y dans l'exemple représentent des chiffres binaires quelconques.
    Nous allons voir qu'après un tour de boucle, le nombre de 1 à droite
    diminue de 1 comme illustré par l’exemple : 
    a          =  xxxx01111 
    2a         = xxxx011110 // décalage vers la gauche
    3a         = yyyyy01101 // addition binaire des deux lignes précédentes
    3a + 1     = yyyyy01110 // ajout de 1
    (3a + 1)/2 =  yyyyy0111 // décalage vers la droite. Le nombre de 1 a diminué

    */

}
