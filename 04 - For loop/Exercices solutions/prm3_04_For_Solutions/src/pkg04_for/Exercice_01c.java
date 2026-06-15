package pkg04_for;

public class Exercice_01c {

    public static void main(String[] args) {
        int a = 3, b = 0;
        for (int k = 1; k < 5; ++k) 
            b = 2 * a + b;
        System.out.println(a + " " + b);
    }

}
