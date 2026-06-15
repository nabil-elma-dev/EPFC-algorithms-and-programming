
package pkg01_assignations;

public class Exercice_01b {
    
    /*
    Le programme affiche les nombres 3 et et 4 séparés par une ligne 
    (qui semble) vide (elle contient un espace invisible)
    */

    public static void main(String[] args) {
        int a, b = 1;
        a = b + 2;
        b = a + b;
        System.out.println(a);
        System.out.println(" ");
        System.out.println(b);
    }

}

