package prm2_15_recursivite_corrections;

import eu.epfc.prm3.Array;

public class Recursivite_ex_15 {

    /*
    v       5       8       2
                            bi
    8
    */
    public static int max(Array<Integer> v, int bi){
        if(bi == v.size() - 1)
            return v.get(bi);
        return Math.max(v.get(bi), max(v, bi + 1));
    }

    public static int max(Array<Integer> v){
        if(v.size() == 0)
            throw new Error("Pas de max !");
        return max(v, 0);
    }
    
    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(5, 2, 7, 4);
        System.out.println("Le plus grand entier du tableau " + tab + " est " + max(tab));
    }
}
