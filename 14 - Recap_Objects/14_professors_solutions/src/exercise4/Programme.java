package objets.cartes;

import eu.epfc.prm3.Array;

public class Programme {

    public static boolean existe(Array<Carte> jeu, Carte c) {
        for (Carte cc : jeu) {
            if (cc.compareTo(c) == 0) {
                return true;
            }
        }
        return false;
    }

    public static int pos(Array<Carte> jeu, Carte c) {
        int idx = 0;
        while (idx < jeu.size() && jeu.get(idx).compareTo(c) < 0) {
            ++idx;
        }
        return idx;
    }
    
    public static void insere(Array<Carte> jeu, Carte c) {
        int idx = pos(jeu, c);
        jeu.add(null);
        for (int k = jeu.size() - 1; k > idx; --k) {
            jeu.set(k, jeu.get(k - 1));
        }
        jeu.set(idx, c);
    }
    
    public static void joue(Array<Carte> jeu, Carte c) {
        if (!existe(jeu, c))
            if (compteCarteValeur(jeu, c) == 2) {
                Array<Carte> brelan = supprimeCarteValeur(jeu, c.valeur);
                insere(brelan, c);
                affiche(brelan, "Brelan : ");
            }
            else
                insere(jeu, c);
    }
    
    public static int compteCarteValeur(Array<Carte> jeu, Carte c) {
        int idx = 0, cpt = 0;
        while(idx < jeu.size() && jeu.get(idx).valeur <= c.valeur) {
            if(jeu.get(idx).valeur == c.valeur)
                ++cpt;
            ++idx;
        }
        return cpt;
    }
    
//    Version alternative    
//    public static int compteCarteValeur(Array<Carte> jeu, Carte c) {
//        int idx = 0, res = 0;
//        while (idx < jeu.size() && jeu.get(idx).valeur < c.valeur) {
//            ++idx;
//        }
//        while (idx < jeu.size() && jeu.get(idx).valeur == c.valeur) {
//            ++res;
//            ++idx;
//        }
//        return res;
//    }
    
    
    public static Array<Carte> supprimeCarteValeur(Array<Carte> jeu, int valeur) {
        Array<Carte> res = new Array<>();
        int toWrite = 0;
        for(int toRead = 0; toRead < jeu.size(); ++toRead){
            if(jeu.get(toRead).valeur == valeur) {
                res.add(jeu.get(toRead));
            } else {
                jeu.set(toWrite, jeu.get(toRead));
                ++toWrite;
            } 
        }
        jeu.reduceTo(toWrite);
        return res;
    }
    
//    Version alternative
//    public static Array<Carte> supprimeCarteValeur(Array<Carte> jeu, int valeur) {
//        Array<Carte> res = new Array<>();
//        int idx = 0;
//        while (idx < jeu.size() && jeu.get(idx).valeur < valeur) {
//            ++idx;
//        }
//        int toWrite = idx;
//        while (idx < jeu.size() && jeu.get(idx).valeur == valeur) {
//            res.add(jeu.get(idx));
//            ++idx;
//        }
//        while (idx < jeu.size()) {
//            jeu.set(toWrite, jeu.get(idx));
//            ++toWrite;
//            ++idx;
//        }
//        jeu.reduceTo(jeu.size() - (idx - toWrite));
//        return res;
//    }

    public static void affiche(Array<Carte> cartes, String msg) {
        System.out.println(msg);
        for (Carte c : cartes) {
            System.out.println(c);
        }
        System.out.println("=============================\n");
    }

    public static void main(String[] args) {
        Array<Carte> jeu = new Array<>();
        Carte   coeur5 = new Carte(5, 2), carreau5 = new Carte(5, 1), 
                trefle7 = new Carte(7, 0), piqueAs = new Carte(1, 3),
                trefle5 = new Carte(5, 0);
        System.out.println("Affichage de la Carte(5,2) : " + coeur5);
        System.out.println("Affichage de la Carte(1,3) : " + piqueAs);
        System.out.println("Affichage de la Carte(11,0) : " + new Carte(11,0));
        System.out.println("Affichage de la Carte(12,1) : " + new Carte(12,1));
        System.out.println("Affichage de la Carte(13,3) : " + new Carte(13,3));
        System.out.println("");
        joue(jeu, coeur5);
        joue(jeu, carreau5);
        joue(jeu, trefle7);
        joue(jeu, piqueAs);
        affiche(jeu, "Jeu :");
        joue(jeu, trefle5);
        affiche(jeu, "Jeu après l'introduction d'un brelan :");
        joue(jeu, trefle7);
        affiche(jeu, "Jeu après l'ajout d'une carte déjà existante ("+trefle7+") :");
    }

}
