package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_03 {

    
    /* Ceci est une façon très peu efficace pour calculer les nombres de
       Fibonacci.
       Cette solution va recalculer plusieurs fois les mêmes nombres de Fibonacci.
       Par exemple, pour calculer fib(10), va calculer fib(8) entièrement ainsi
       que fib(9). Or pour calculer fib(9), va recalculer fib(8) alors qu'il a 
       déjà été calculé. Dessinez l'arbre d'appel pour vous en rendre compte.
    */
    
    //On suppose ici que fib(0) == 1 et fib(1) == 1
    //pre : n >= 0
    public static int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un nombre strictement positif : ");
        int n = in.nextInt();
        System.out.println("Le nombre de Fibonacci de rang " + n + " est " + fib(n));
    }
}
