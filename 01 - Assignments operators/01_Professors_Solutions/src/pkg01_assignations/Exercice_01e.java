
package pkg01_assignations;

public class Exercice_01e {
    
    /*
    Affiche 3 5 et à la ligne suivante 5 5
    Le programme essaie de donner à a la valeur de b (qui au départ est 5)
    et à b la valeur de a (qui au départ est 3)
    Mais bien sûr ça ne va pas et au final a et b valent tous deux 5
    */

    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
        a = b;
        b = a;
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
    }

}

