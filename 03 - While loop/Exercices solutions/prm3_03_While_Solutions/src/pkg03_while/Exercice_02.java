package pkg03_while;

import java.util.Scanner;

public class Exercice_02 {

    /*
     Cette solution est simple mais ne tient pas compte du fait que l'utilisateur
     pourrait n'avoir aucun nombre à entrer (n == 0) ce qui donnerait 
     une division par zéro!!
    
     Remarquez les déclarations des différentes variables. Par exemple x est
     déclarée localement dans la boucle while et n'est utilisable que dans 
     cette boucle.
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double somme = 0;
        System.out.print("Combien y aura-t-il de nombres: ");
        int n = scan.nextInt();
        int k = 1;
        while (k <= n) {
            System.out.print("Nombre suivant: ");
            double x = scan.nextDouble();
            somme += x;
            ++k;
        }
        // Attention à la potentielle division par zéro !
        System.out.println("Moyenne: " + somme / n);   
    }

//    /*
//     Cette solution vérifie si l'utilisateur entre une valeur nulle (ou négative)
//     pour n auquel cas il n'y a pas de moyenne
//     */
//    
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double somme = 0;
//        System.out.print("Combien y aura-t-il de nombres: ");
//        int n = scan.nextInt();
//        if (n <= 0) {
//            System.out.println("Pas de nombres, pas de moyenne!");
//        } else {
//            int k = 1;
//            while (k <= n) {
//                System.out.print("Nombre suivant: ");
//                double x = scan.nextDouble();
//                somme += x;
//                ++k;
//            }
//            System.out.println("Moyenne: " + somme / n);
//        }
//    }

}
