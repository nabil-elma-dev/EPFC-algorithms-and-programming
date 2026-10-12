package exercices456;

import java.util.Scanner;

public class Date {
    public int jour, mois, annee;
    
    public Date() {}
    
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
    
    public String toString() {
        return this.jour + "/" + this.mois + "/" + this.annee;
    }
    
    public void saisie() {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un jour : ");
        this.jour = in.nextInt();
        System.out.print("Entrez un mois : ");
        this.mois = in.nextInt();
        System.out.print("Entrez un année : ");
        this.annee = in.nextInt();
    }
    
    public void affiche() {
        System.out.println(this);
    }
    
    public int compareTo(Date other) {
        return (this.annee * 10000 + this.mois * 100 + this.jour)
                - (other.annee * 10000 + other.mois * 100 + other.jour);
    }

}
