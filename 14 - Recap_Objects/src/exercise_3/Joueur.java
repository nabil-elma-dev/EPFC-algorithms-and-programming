package exercise_3;

public class Joueur {

    public String idJoueur;
    public int score;

    public Joueur(String idJoueur, int score) {
        this.idJoueur = idJoueur;
        this.score = score;
    }

    public int compareTo(Joueur otherPlayer) {
        return this.idJoueur.compareToIgnoreCase(otherPlayer.idJoueur);
    }
}