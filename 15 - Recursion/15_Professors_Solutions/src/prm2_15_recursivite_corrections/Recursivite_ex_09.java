package prm2_15_recursivite_corrections;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class Recursivite_ex_09 {
//    //Version itérative
//    //PRE : v est trié
//    public static boolean recherche(Array<Integer> v, int val) {
//        int bi = 0, bs = v.size(), m = (bi + bs) / 2;
//        while(bi < bs && v.get(m) != val) {
//            if(val < v.get(m)) //On cherche à gauche
//                bs = m;
//            else               //On cherche à droite
//                bi = m + 1;
//            m = (bi + bs) / 2;
//        }
//        return bi < bs;
//    } 

    public static boolean aux(int val, Array<Integer> v, int deb, int fin) {
        if (deb == fin)
            return false;
        int mil = (deb + fin) / 2;
        if (val == v.get(mil))
            return true;
        if (val < v.get(mil))
            //on cherche à gauche
            return aux(val, v, deb, mil);
        //on cherche à droite
        return aux(val, v, mil + 1, fin);
    }

    // Renvoie true si val apparait dans v; false sinon
    // Précondition : v est trié par ordre croissant
    public static boolean rechercheDicho(int val, Array<Integer> v) {
        return aux(val, v, 0, v.size());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Array<Integer> tab = new Array<>(1, 3, 4, 6, 8, 9, 10);
        System.out.println("Entrez une valeur à chercher dans le tableau " + tab);
        int val = in.nextInt();
        if (rechercheDicho(val, tab)) {
            System.out.println("La valeur " + val + " se trouve dans le tableau.");
        } else {
            System.out.println("La valeur " + val + " ne se trouve pas dans le tableau.");
        }
    }
    
    
//    // Version alternative où l'on cherche la position d'insertion
//    public static int aux(int val, Array<Integer> v, int deb, int fin) {
//        int mil = (deb + fin) / 2;
//        if (deb == fin || val == v.get(mil))
//            return mil;
//        if (val < v.get(mil))
//            //on cherche à gauche
//            return aux(val, v, deb, mil);
//        //on cherche à droite
//        return aux(val, v, mil + 1, fin);
//    }
//
//    // Renvoie la position où se trouve val dans v (si val s'y trouve)
//    // sinon, renvoie la position d'insertion de val dans v
//    // Précondition : v est trié par ordre croissant
//    public static int rechercheDicho(int val, Array<Integer> v) {
//        return aux(val, v, 0, v.size());
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Array<Integer> tab = new Array<>(1, 3, 4, 6, 8, 9, 10);
//        System.out.println("Entrez une valeur à chercher dans le tableau " + tab);
//        int val = in.nextInt();
//        int pos = rechercheDicho(val, tab);
//        if(pos < tab.size() && tab.get(pos) == val)
//            System.out.println("La valeur " + val + " se trouve dans le tableau en position " + pos + ".");
//        else 
//            System.out.println("La valeur " + val + " ne se trouve pas dans le tableau. Elle devrait être en position " + pos + ".");
//    }
}
