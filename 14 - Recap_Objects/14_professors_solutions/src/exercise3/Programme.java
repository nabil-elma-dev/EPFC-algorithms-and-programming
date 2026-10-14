package objets.equipe;

import eu.epfc.prm3.Array;

public class Programme {
    
    //renvoie la position du joueur ou la position où il devrait se trouver
    public static int pos(Array<Joueur> equipe, String nom) {
        int i = 0;
        while(i < equipe.size() && equipe.get(i).idJoueur.compareTo(nom) < 0)
            ++i;
        return i;
    }
    
   
    public static void gestion(Array<Joueur> equipe, String nom, int score) {
        int pos = pos(equipe, nom);
        //si la position est valide et qu'elle contient le joueur en question
        if(pos < equipe.size() && equipe.get(pos).idJoueur.compareTo(nom) == 0) {
            int oldScore = equipe.get(pos).score;
            if(score >= oldScore)
                equipe.get(pos).score = score; 
            else
                suppression(equipe, pos);
        } else 
            insertion(equipe, new Joueur(nom,score), pos);
    }

    public static void insertion(Array<Joueur> equipe, Joueur j, int pos){
        if(pos >= 0 && pos <= equipe.size()){
            equipe.add(null);
            for(int i = equipe.size() - 1; i > pos ; --i)
                equipe.set(i, equipe.get(i - 1));
            equipe.set(pos, j);
        } else {
            throw new RuntimeException("pos invalide");
        }
    }
    
    public static void suppression(Array<Joueur> equipe, int pos){
        if(pos >= 0 && pos < equipe.size()){
            for(int i = pos; i < equipe.size() - 1; ++i)
                equipe.set(i, equipe.get(i + 1));
            equipe.reduceTo(equipe.size() - 1);
        } else {
            throw new RuntimeException("pos invalide"); 
        }
    }
    
    public static void affiche(Array<Joueur> equipe){
        for(Joueur j : equipe)
            System.out.print(j.idJoueur + "\t");
        System.out.println();
        for(Joueur j : equipe)
            System.out.print(j.score + "\t");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Array<Joueur> e = new Array<>();
        
        gestion(e, "Anne", 90); 
        gestion(e, "Daniel", 20);
        gestion(e, "Emile", 60);
        gestion(e, "Jules", 18);
        gestion(e, "Julie", 30);
        gestion(e, "Raoul", 11);
        
        affiche(e);
        
        gestion(e, "Julie", 20);
        
        affiche(e);
        
        gestion(e, "Daniel", 40);
        
        affiche(e);
        
        gestion(e, "Carine", 25);
        
        affiche(e);
        
        System.out.println("=============================================");
    }
    
}
