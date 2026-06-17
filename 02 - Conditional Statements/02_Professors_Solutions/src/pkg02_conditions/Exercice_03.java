
package pkg02_conditions;

import java.util.Scanner;

public class Exercice_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        double x = scan.nextDouble();
        System.out.print("Sa valeur absolue est: ");
        if(x < 0) 
            System.out.println(-x);
        else
            System.out.println(x);            
    }
    
//    /*
//    Version alternative:
//    Si la valeur originale de x n'est plus utile on peut la changer si 
//    elle est négative
//    */
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Entrez un nombre: ");
//        double x = scan.nextDouble();
//        if(x < 0) 
//            x = -x;
//        System.out.print("Sa valeur absolue est: ");  
//        System.out.println(x);
//    }
    
//    /*
//    Version alternative:
//    Les suites de println peuvent être fastidieuse
//    Java permet de "concaténer" (mettre bout à bout) les affichages dans un
//    seul println (voir slides).
//    Le programme précédent peut avantageusement s'écrire ainsi
//    */
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Entrez un nombre: ");
//        double x = scan.nextDouble();
//        if(x < 0) 
//            x = -x;
//        System.out.println("Sa valeur absolue est: " + x);  
//    }

//    /*
//    Version alternative:
//    Utiliser une variable supplémentaire pour la valeur absolue 
//    */
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Entrez un nombre: ");
//        double x = scan.nextDouble();
//        double va;
//        if(x < 0) 
//            va = -x;
//        else
//            va = x;
//        System.out.println("Sa valeur absolue est: " + va);  
//    }

}

