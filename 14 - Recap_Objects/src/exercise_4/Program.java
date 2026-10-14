package exercise_4;

import eu.epfc.prm3.Array;

public class Program {
    public static void main(String[] args) {
        Array<Carte> jeu = new Array<>();
        Carte coeur5 = new Carte(5, 2), carreau5 = new Carte(5, 1),
                trefle7 = new Carte(7, 0), piqueAs = new Carte(1, 3),
                trefle5 = new Carte(5, 0);
        System.out.println("Affichage de la Carte(5,2) : " + coeur5);
        System.out.println("Affichage de la Carte(1,3) : " + piqueAs);
        System.out.println("Affichage de la Carte(11,0) : "
                + new Carte(11,0));
        System.out.println("Affichage de la Carte(12,1) : "
                + new Carte(12,1));
        System.out.println("Affichage de la Carte(13,3) : "
                + new Carte(13,3));
        System.out.println("");
        joue(jeu, coeur5);
        joue(jeu, carreau5);
        joue(jeu, trefle7);
        joue(jeu, piqueAs);
        affiche(jeu, "Jeu :");
        joue(jeu, trefle5);
        affiche(jeu, "Jeu après l'introduction d'un brelan :");
        joue(jeu, trefle7);
        affiche(jeu, "Jeu après l'ajout d'une carte déjà existante("+trefle7+") :");
    }

    public static void joue(Array<Carte> jeu, Carte c) {
        if (!cardAlreadyExists(jeu, c)) {
            if (nbCardsWithSameValue(jeu, c) == 2) {
                removeBrelan(jeu, c);
            } else if (nbCardsWithSameValue(jeu, c) < 2) {
                addAndSort(jeu, c);
            };
        }
    }

    private static int nbCardsWithSameValue(Array<Carte> jeu, Carte c) {
        int qty = 0;
        int pos = 0;
        while (pos < jeu.size() && jeu.get(pos).compareValue(c) <= 0) {
            if (jeu.get(pos).compareValue(c) == 0) {
                ++qty;
            }
            ++ pos;
        }
        return qty;
    }

    public static boolean cardAlreadyExists(Array<Carte> jeu, Carte c) {
        int pos = 0;
        while (pos < jeu.size() && jeu.get(pos).compareTo(c) != 0) {
            ++pos;
        }
        return pos < jeu.size();
    }

    public static void affiche (Array<Carte> jeu, String s) {
        System.out.println(s);
        for (Carte c : jeu) {
            System.out.println(c);
        }
        System.out.println("=============================\n");
    }

    private static void removeBrelan(Array<Carte> jeu, Carte c) {
        int write = grabPosition(jeu, c);
        int read = write + 2;
        for (; read < jeu.size(); ++ read) {
            jeu.set(write, jeu.get(read));
            ++write;
        }
        jeu.reduceTo(jeu.size() - 2);
    }

    public static int grabPosition(Array<Carte> jeu, Carte c) {
        int pos = 0;
        while (pos < jeu.size() && jeu.get(pos).compareValue(c) < 0) {
            ++pos;
        }
        return pos;
    }

    private static void addAndSort(Array<Carte> jeu, Carte c) {
        jeu.add(null);
        int pos = jeu.size() - 1;
        while (pos > 0 && jeu.get(pos - 1).compareValue(c) >= 0) {
            jeu.set(pos, jeu.get(pos -1));
            -- pos;
        }
        jeu.set(pos, c);
    }
}
