package prm2_15_recursivite_corrections;

import eu.epfc.prm3.Array;

public class Recursivite_ex_08 {
    
    //Fonction auxilière
    //Somme les éléments de v à partir de bi (borne inférieure)
    public static int sommeAPartirDe(int bi, Array<Integer> v){
        if(bi == v.size())
            return 0;
        return v.get(bi) + sommeAPartirDe(bi + 1, v);
    }
    
    //Somme tous les éléments de v.
    public static int somme(Array<Integer> v){
        return sommeAPartirDe(0, v);
    }
    
    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(1, 2, 3, 4);
        System.out.println("La somme des éléments du tableau " + tab + " vaut " + somme(tab));
    }
}
