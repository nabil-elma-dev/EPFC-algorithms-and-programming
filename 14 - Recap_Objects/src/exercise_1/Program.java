package exercise_1;

import eu.epfc.prm3.Array;

public class Program {
    public static void main(String[] args) {
        Array<String> text = new Array<>("Question 4) Imaginons qu'un texte soit memorise",
                "dans un tableau de strings. Chaque string du",
                "tableau correspond a une ligne du texte.",
                "Les traitements de texte disposent en general d'une fonctionnalite",
                "qui, pour ameliorer la lisibilite, insere de l'espace vertical",
                "entre deux paragraphes. Pour nos besoins, la fin d'un paragraphe",
                "sera definie comme une ligne se terminant par un point ('.').",
                "Ecrivez une fonction separerParagraphes(Array<String> texte)",
                "qui recoit un Array de String et qui insere un string vide",
                "apres chaque string se terminant par un point.");
        affiche(text);
        separateParagraphs(text);
        affiche(text);
    }

    public static void separateParagraphs(Array<String> text) {
        int nbEmptySpaces = addEmptySpacesAndGetNb(text);
        placeEmptySpaces(text, nbEmptySpaces);
    }

    private static void placeEmptySpaces(Array<String> text, int nbEmptySpaces) {
        int read = text.size() - (nbEmptySpaces + 1);
        int write = text.size() - 1;
        for (; read > 0; --read) {
            if (lastCharIsFullStop(text.get(read))) {
                text.set(write, "");
                --write;
            }
            text.set(write, text.get(read));
            --write;
        }
    }

    private static int addEmptySpacesAndGetNb(Array<String> text) {
        int nbEmptySpaces = 0;
        for (String s : text) {
            if (lastCharIsFullStop(s)) {
                ++nbEmptySpaces;
            }
        }
        text.extend(nbEmptySpaces, "");
        return nbEmptySpaces;
    }

    public static boolean lastCharIsFullStop(String s) {
        return s.charAt(s.length() - 1) == '.';
    }

    public static void affiche(Array<String> texte) {
        for (String s : texte) {
            System.out.println(s);
        }
        System.out.println("===========================================");
    }
}
