package exercise_4;

public class Carte {
    public int  valeur, // 1..10, 11 = valet, 12 = dame, 13 = roi
                couleur; // 0 = trèfle, 1 = carreau, 2 = coeur, 3 = pique

    public Carte(int valeur, int couleur) {
        if (valeur < 1 || valeur > 13 || couleur < 0 || couleur > 3)
            throw new Error("Erreur paramètre");
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int compareTo(Carte otherCard) {
        return
                this.valeur - otherCard.valeur == 0?
                    this.couleur - otherCard.couleur
                    : this.valeur - otherCard.valeur;
    }

    public int compareValue(Carte otherCard) {
        return this.valeur - otherCard.valeur;
    }

    @Override
    public String toString() {
        return configValue() + " de " + configColor();
    }

    private String configValue() {
        return switch (this.valeur) {
            case 1 -> "As";
            case 11 -> "Valet";
            case 12 -> "Dame";
            case 13 -> "Roi";
            default -> "" + this.valeur;
        };
    }

    private String configColor() {
        return switch (this.couleur) {
            case 0 -> "trèfle";
            case 1 -> "carreau";
            case 2 -> "coeur";
            default -> "pique";
        };
    }
}
