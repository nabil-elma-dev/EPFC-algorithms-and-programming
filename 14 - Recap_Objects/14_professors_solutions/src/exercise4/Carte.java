package objets.cartes;

import eu.epfc.prm3.Array;

public class Carte {

    public int valeur, // 1..10, 11 = valet, 12 = dame, 13 = roi
            couleur;   // 0 = trèfle, 1 = carreau, 2 = coeur, 3 = pique  

    public Carte(int valeur, int couleur) {
        if (valeur < 1 || valeur > 13 || couleur < 0 || couleur > 3) {
            throw new Error("Erreur paramètre");
        }
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int compareTo(Carte c) {
        if (this.valeur == c.valeur) {
            return this.couleur - c.couleur;
        }
        return this.valeur - c.valeur;
    }

    @Override
    public String toString() {
        Array<String> vals = new Array("As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi");
        Array<String> cols = new Array("trèfle", "carreau", "coeur", "pique");
        return vals.get(this.valeur - 1) + " de " + cols.get(this.couleur);
    }
    
//    //Version alternative
//    @Override
//    public String toString() {
//        String msg;
//        if (valeur == 1) {
//            msg = "As";
//        } else if (valeur <= 10) {
//            msg = "" + valeur;
//        } else if (valeur == 11) {
//            msg = "Valet";
//        } else if (valeur == 12) {
//            msg = "Dame";
//        } else {
//            msg = "Roi";
//        }
//        msg += " de ";
//        if (couleur == 0) {
//            msg += "trèfle";
//        } else if (couleur == 1) {
//            msg += "carreau";
//        } else if (couleur == 2) {
//            msg += "coeur";
//        } else {
//            msg += "pique";
//        }
//        return msg;
//    }
}
