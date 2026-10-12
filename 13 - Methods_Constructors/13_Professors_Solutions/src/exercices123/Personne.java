package exercices123;


import java.util.Scanner;

public class Personne {
    public String nom, prenom;
    public Date ddn; 
    
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
        System.out.print(this.nom + " " + this.prenom + " née le ");
        this.ddn.affiche();
    }
    
    public int compareToAge(Personne other) {
        return -this.ddn.compareTo(other.ddn); //l'ordre des dates est l'inverse
        //de l'ordre des ages
    }

    public int compareToNomPrenom(Personne other) {
        return (this.nom + " " + this.prenom).compareToIgnoreCase(other.nom + " " + other.prenom);
    }
    
}
