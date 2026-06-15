
package pkg01_assignations;

public class Exercice_01a {
    
    /*
    Le programme affiche les nombres 3 et 4.
    Malheureusement, ils sont collés et semblent donner le nombre 34
    Une solution est de les espacer:
        System.out.print(a);
        System.out.print(" ");   // Affiche un espace
        System.out.println(b);    
    */

    public static void main(String[] args) {
        int a, b;
        b = 1;
        a = b + 2;
        b = a + b;
        System.out.print(a);
        System.out.print(b);
    }

}

