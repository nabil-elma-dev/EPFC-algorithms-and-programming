package prm2_15_recursivite_corrections;

import eu.epfc.prm3.Array;

public class Correctif {

    public static void main(String[] args) {
        int val = 1111;
        System.out.println("bin2Dec(" + val + ") : " + bin2Dec(val));
        Array<Integer> t = new Array<>(5, 8, 2);
        System.out.println(t);
        System.out.println(plusGrandDansTab(t));
        System.out.println(nbMaj("DceDDeeeA"));
//        affALEnvers(val);
//        System.out.println("coucou");
//        System.out.println(val + " : " + nb2(val));
//        System.out.println("queDesPairs(" + val + ") : " + queDesPairs(val));
    }

    public static int nbMaj(String s) {
//        if (s.isEmpty()) return 0;
//        return estMaj(s.charAt(0))
//                ? 1 + nbMaj(s.substring(1))
//                : nbMaj(s.substring(1));
        return nbMajAux(s, 0);
    }

    public static int nbMajAux(String s, int idx) {
        if (idx == s.length()) return 0;
        return estMaj(s.charAt(idx))
                ? 1 + nbMajAux(s, idx + 1)
                : nbMajAux(s, idx + 1);
    }


    public static boolean estMaj(char c) {
        return c >= 'A' && c <= 'Z';
    }

    // !tab.isEmpty()
    public static int plusGrandDansTab(Array<Integer> tab) {
        if (tab.isEmpty()) throw new RuntimeException("Tableau vide");
        return plusGrandAux(tab, 1, tab.get(0));
    }

    /*
    tab     5       8       2
                                idx
    max     8

    tab     5       8       2
                            idx
    max     8
    valIdx  2

    tab     5       8       2
                    idx
    max     5
    valIdx  8
     */
    public static int plusGrandAux(Array<Integer> tab, int idx, int max) {
        if (idx >= tab.size()) return max;
        int valIdx = tab.get(idx);
        return plusGrandAux(tab, idx  + 1, Math.max(valIdx, max));
    }

    /*
    valBinaire  11001 = 1*2^0 + 0*2^1 + 0*2^2 + 1*2^3 + 1*2^4
    bin2Dec(11001)  = 2 * bin2Dec(1100) + 1
                    = 2 * (2 * bin2Dec(110)) + 1
                    = 2 * (2 * (2 * bin2Dec(11))) + 1
                    = 2 * (2 * (2 * (2 * bin2Dec(1)) + 1)) + 1
                    = 2 * (2 * (2 * (2 * (bin2Dec(0) + 1) + 1)) + 1
                    = 2 * (2 * (2 * (2 * 1) + 1)) + 1
                    = 2 * (2 * (2 * 3)) + 1
                    = 2 * 12 + 1
                    = 25
     */
    public static int bin2Dec(int valBinaire) {
        if (valBinaire == 0) return 0;
        return 2 * bin2Dec(valBinaire / 10)
                + valBinaire % 10;
    }

    public static int plusGrandChiffre(int val) {
//        if (val < 10) return val;
//        int last = val % 10;
//        int max_others = plusGrandChiffre(val / 10);
//        return last > max_others ? last : max_others;
        return plusGrandChiffre_aux(val, 0);
    }

    public static int plusGrandChiffre_aux(int val, int res) {
        if (val == 0) return res;
        if (val % 10 > res)
            res = val % 10;
        return plusGrandChiffre_aux(val / 10, res);
    }

    public static void affALEnvers(int n) {
        if (n < 10)
            System.out.println(n);
        else {
            System.out.print(n % 10);
            affALEnvers(n / 10);
        }
    }

    public static boolean queDesPairs(int val) {
        if (val == 0) return true;
        else if (val % 2 != 0) return false;
        else return queDesPairs(val / 10);
    }

    /*
    nb2(325226) = nb2(32522)
                = 1 + nb2(3252)
                = 1 + 1 + nb2(325)
                = 1 + 1 + nb2(32)
                = 1 + 1 + 1 + nb2(3)
                = 1 + 1 + 1 + nb2(0)
                = 1 + 1 + 1 + 0 = 3
     */

    public static int nb2(int val) {
        if (val == 0) return 0;
        if (val % 10 == 2) return 1 + nb2(val/10);
        return nb2(val/10);
    }

    public static int recherche_dicho(Array<Integer> tab, int val) {
        return recherche_dicho(tab, val, 0, tab.size());
    }

    /*
            0   1   2   3   4   5   6
    t       2   5   5   7   8   11  15
    rd(t,10) = rd(t,10,0,7) = rd(t,10,4,7) = rd(t,10,4,5) = rd(t,10,5,5) = false
     */
    public static int recherche_dicho(Array<Integer> tab, int val, int bi, int bs) {
        if (bi >= bs) return bs;
        int m = (bi + bs) / 2, vInTab = tab.get(m);
        if (vInTab == val)
            return m;
        else if (val > vInTab)
            return recherche_dicho(tab, val, m+1, bs);
        else
            return recherche_dicho(tab, val, bi, m);
    }

    public static int somme(Array<Integer> tab) {
        return somme_aux(tab, 0);
    }

    public static int somme_aux(Array<Integer> tab, int idx) {
        if (idx >= tab.size()) return 0;
        return tab.get(idx) + somme_aux(tab, idx + 1);
    }
}
