package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_16 {
    public static boolean estMaj(char c){
        return c >= 'A' && c <= 'Z';
    }

    public static int nbMajuscules(String s, int bi){
        if(bi == s.length())
            return 0;
        if(estMaj(s.charAt(bi)))
            return 1 + nbMajuscules(s, bi + 1);
        return nbMajuscules(s, bi + 1);
    }
    
    public static int nbMajuscules(String s){
        return nbMajuscules(s, 0);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = in.next();
        System.out.println("Il y a " + nbMajuscules(mot) + " majuscule(s) dans " + mot);
    }
}
