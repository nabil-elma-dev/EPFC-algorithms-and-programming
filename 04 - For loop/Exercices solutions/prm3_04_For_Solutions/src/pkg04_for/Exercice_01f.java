package pkg04_for;

public class Exercice_01f {

    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 3; ++i) {
            a += i;
            for (int j = 4; j <= 5; ++j) 
                a += 1;
        }
        System.out.println(a);
    }

}
