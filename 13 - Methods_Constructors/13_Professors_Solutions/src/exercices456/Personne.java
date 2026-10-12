package exercices456;


import java.time.LocalDate;
import java.util.Scanner;

public class Personne {
    public String nom, prenom;
    public Date ddn; 
    
    public Personne() {}
    
    public Personne(String nom, String prenom, int jour, int mois, int annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = new Date(jour, mois, annee);
    }
    
    public String toString() {
        return this.nom + " " + this.prenom + " née le " + this.ddn;
    }
    
    public void saisie() {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un nom : ");
        this.nom = in.next();
        System.out.print("Entrez un prénom : ");
        this.prenom = in.next();

        this.ddn = new Date(); // !!
        System.out.println("Entrez une date de naissance : ");
        this.ddn.saisie();
    }
    
    
    public void affiche() {
        System.out.println(this);
    }
    
    public int compareToAge(Personne other) {
        return -this.ddn.compareTo(other.ddn); //l'ordre des dates est l'inverse
        //de l'ordre des ages
    }

    public int compareToNomPrenom(Personne other) {
        return (this.nom + " " + this.prenom).compareToIgnoreCase(other.nom + " " + other.prenom);
    }
    
    public int getAge() {
        LocalDate now = LocalDate.now();
        int jour = now.getDayOfMonth();
        int mois = now.getMonthValue();
        int annee = now.getYear();
        
        int age = annee - this.ddn.annee;
        if(mois < this.ddn.mois || (mois == this.ddn.mois && jour < this.ddn.jour))
            --age;
        return age;        
    }
    
}
