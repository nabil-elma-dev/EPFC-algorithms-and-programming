package prm2_15_recursivite_corrections;

public class Recursivite_ex_03_rec_terminale {

    public static void main(String[] args) {
        System.out.println(fib(50));
    }
    public static long fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib_aux(n-2, 1, 1);
    }

    public static long fib_aux(int n, long fib1, long fib2) {
        if (n == 0)
            return fib2;
        else
            return fib_aux(n-1, fib2, fib1+fib2);
    }
}
