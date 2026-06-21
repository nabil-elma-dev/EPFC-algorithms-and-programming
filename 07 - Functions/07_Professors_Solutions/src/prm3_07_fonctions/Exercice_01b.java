package prm2_07_fonctions;

public class Exercice_01b {
    
    // Une constante utilisée partout
    static final int  MAX = 4; 

    public static int fct_01b(int n) {
        int somme = 0;
        while(n < MAX) {
            somme += n;
            ++n;
        }
        return somme;
    }

    public static void main(String[] args) {
        for (int cpt = 1; cpt < MAX; ++cpt) 
            System.out.println(fct_01b(cpt));
    }

}
