package pkg02_conditions;

import java.util.Scanner;

public class Exercice_02b {
    
    /*
    Le programme semble différencier 4 situations selon que a soit ou non > 0
    et que b soit ou non > 1
    Mais en vérité, si b n'est pas > 1 (b <= 1), le programme affiche "Salut"
    quelque soit a.
    Il doit donc être possible de regrouper les cas différemment comme
    dans le programme alternatif donné plus bas
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 0) 
            if (b > 1) 
                System.out.println("Bonjour");
            else 
                System.out.println("Salut");
        else
            if (b > 1) 
                System.out.println("Coucou");
            else 
                System.out.println("Salut");
    }
    
//    /*
//    Ce programme est équivalent mais plus simple car il change l'ordre des 
//    tests portant sur a et b afin de ne pas distinguer les cas a > 0 ou pas
//    dans la situation où b <= 1
//    */
//    
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        if (b > 1) 
//            if (a > 0) 
//                System.out.println("Bonjour");
//            else 
//                System.out.println("Coucou");
//        else
//            System.out.println("Salut");
//    }
    

}
