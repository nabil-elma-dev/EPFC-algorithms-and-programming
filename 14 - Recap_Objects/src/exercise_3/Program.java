package exercise_3;

import eu.epfc.prm3.Array;

public class Program {
    public static void main(String[] args) {
        Array<Joueur> players = new Array<>();
        gestion(players, "Anne", 90);
        gestion(players, "Daniel", 20);
        gestion(players, "Emile", 60);
        gestion(players, "Jules", 18);
        gestion(players, "Julie", 30);
        gestion(players, "Raoul", 11);
        affiche(players);
        gestion(players, "Julie", 20);
        affiche(players);
        gestion(players, "Daniel", 40);
        affiche(players);
        gestion(players, "Carine", 25);
        affiche(players);
        System.out.println("======================================");
    }

    public static void affiche(Array<Joueur> players) {
        for (Joueur p : players) {
            System.out.print(p.idJoueur + "\t\t");
        }
        System.out.println();
        for (Joueur p : players) {
            System.out.print(p.score + "\t\t\t");
        }
        System.out.println();

    }

    public static void gestion(Array<Joueur> players, String pName, int score) {
        if (idExists(players, pName)) {
            int target = findPos(players, pName);
            if (players.get(target).score > score) {
                slidingElemToErase(players, target);
            }
            else {
                updateScore(players, target, score);
            }
        } else {
            addAndSort(players, pName, score);
        };
    }

    private static void updateScore(Array<Joueur> players, int target, int newScore) {
        players.set(target, new Joueur(players.get(target).idJoueur, newScore));
    }

    private static void slidingElemToErase(Array<Joueur> players, int target) {
        for (int currentPos = target; currentPos < players.size() - 1; ++currentPos){
            Joueur PLayerToDelete = players.get(currentPos);
            players.set(currentPos, players.get(currentPos + 1));
            players.set(currentPos + 1, PLayerToDelete);
        };
        players.reduceTo(players.size() - 1);
    }

    public static void addAndSort(Array<Joueur> players, String pName, int score) {
        players.add(new Joueur(pName, score));
        int pos = players.size() - 1;
        sortPlayers(players, pos);
    }

    private static void sortPlayers(Array<Joueur> players, int pos) {
        while (pos > 0 && players.get(pos).compareTo(players.get(pos - 1)) < 0) {
            Joueur p = players.get(pos - 1);
            players.set(pos - 1, players.get(pos));
            players.set(pos, p);
            --pos;
        }
    }

    public static boolean idExists(Array<Joueur> players, String pName) {
        int pos = findPos(players, pName);
        return pos < players.size();
    }

    public static int findPos(Array<Joueur> players, String pName) {
        int pos = 0;
        while (pos < players.size() && players.get(pos).idJoueur.compareToIgnoreCase(pName) != 0) {
            ++ pos;
        }
        return pos;
    }

}
