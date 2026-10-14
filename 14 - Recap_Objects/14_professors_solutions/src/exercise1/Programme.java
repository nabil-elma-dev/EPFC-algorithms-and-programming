package objets.traitementTexte;

import eu.epfc.prm3.Array;

public class Programme {

    public static boolean finitParPoint(String s) {
        if (s.length() == 0) {
            return false;
        }
        return s.charAt(s.length() - 1) == '.';
    }

    public static int nbPoints(Array<String> texte) {
        int res = 0;
        for (String s : texte) {
            if (finitParPoint(s)) {
                ++res;
            }
        }
        return res;
    }

    public static void separerParagraphes(Array<String> texte) {
        int nbPoints = nbPoints(texte);
        int toRead = texte.size() - 1;
        texte.extend(nbPoints, null);
        int toWrite = texte.size() - 1;
        while (toWrite > toRead) {
            String s = texte.get(toRead);
            if (finitParPoint(s)) {
                texte.set(toWrite, "");
                --toWrite;
            }
            texte.set(toWrite, s);
            --toWrite;
            --toRead;
        }
    }

    public static void affiche(Array<String> texte) {
        for (String s : texte) {
            System.out.println(s);
        }
        System.out.println("===========================================");
    }

    public static void main(String[] args) {
        Array<String> texte = new Array<>("Question 4) Imaginons qu'un texte soit memorise",
                "dans un tableau de strings. Chaque string du",
                "tableau correspond a une ligne du texte.",
                "Les traitements de texte disposent en general d'une fonctionnalite",
                "qui, pour ameliorer la lisibilite, insere de l'espace vertical",
                "entre deux paragraphes. Pour nos besoins, la fin d'un paragraphe",
                "sera definie comme une ligne se terminant par un point ('.').",
                "Ecrivez une fonction separerParagraphes(Array<String> texte)",
                "qui recoit un Array de String et qui insere un string vide",
                "apres chaque string se terminant par un point.");
        affiche(texte);
        separerParagraphes(texte);
        affiche(texte);
    }
}
