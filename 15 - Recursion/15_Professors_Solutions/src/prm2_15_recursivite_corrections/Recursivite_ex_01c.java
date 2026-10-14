package prm2_15_recursivite_corrections;

public class Recursivite_ex_01c {

    public static void mystere(int n) {
        if (n >= 1) {
            System.out.println(n);
            mystere(n + 1);
        }
    }

    
    
    public static void main(String[] args) {
        mystere(5);
        /* L'appel à mystere(5) provoque une récursion infinie.
           En pratique, la taille du stack est limitée et donc cet appel 
           déclenche une StackOverflowError
        */
    }
}
