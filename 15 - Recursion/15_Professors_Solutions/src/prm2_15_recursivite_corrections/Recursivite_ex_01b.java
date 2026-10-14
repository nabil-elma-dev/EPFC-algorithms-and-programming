package prm2_15_recursivite_corrections;

public class Recursivite_ex_01b {

    public static void mystere(int n) {
        if (n >= 1) {
            System.out.println(n);
            mystere(n - 1);
        }
    }
    
    public static void main(String[] args) {
        mystere(5);
    }
}
