package prm2_12bis_tris;

import eu.epfc.prm2.Array;
import java.util.Scanner;

public class Programme {

    public static Scanner in = new Scanner(System.in);

    public static void saisie(Date d) {
        System.out.print("Entrez un jour : ");
        d.jour = in.nextInt();
        System.out.print("Entrez un mois : ");
        d.mois = in.nextInt();
        System.out.print("Entrez un année : ");
        d.annee = in.nextInt();
    }

    public static void saisie(Personne p) {
        System.out.print("Entrez un nom : ");
        p.nom = in.next();
        System.out.print("Entrez un prénom : ");
        p.prenom = in.next();

        p.ddn = new Date(); // !!
        System.out.println("Entrez une date de naissance : ");
        saisie(p.ddn);
    }

    public static void affiche(Date d) {
        System.out.println(d.jour + "/" + d.mois + "/" + d.annee);
    }

    public static void affiche(Personne p) {
        System.out.print(p.nom + " " + p.prenom + " née le ");
        affiche(p.ddn);
    }

    public static int compare(Date d1, Date d2) {
        return (d1.annee * 10000 + d1.mois * 100 + d1.jour)
                - (d2.annee * 10000 + d2.mois * 100 + d2.jour);
    }

    public static int compareAge(Personne p1, Personne p2) {
        return -compare(p1.ddn, p2.ddn); //l'ordre des dates est l'inverse
        //de l'ordre des ages
    }

    public static int compareNomPrenom(Personne p1, Personne p2) {
        return (p1.nom + " " + p1.prenom).compareTo(p2.nom + " " + p2.prenom);
    }

    public static void saisie(Array<Personne> tab) {
        System.out.println("Combien de personnes voulez-vous encoder ?");
        int nb;
        nb = in.nextInt();
        for (int i = 0; i < nb; ++i) {
            System.out.println("Encodez la personne " + (i + 1));
            Personne p = new Personne();
            saisie(p);
            tab.add(p);
        }
    }

    public static void affiche(Array<Personne> tab) {
        for (int i = 0; i < tab.size(); ++i) {
            System.out.print("Personne " + (i + 1) + " : ");
            affiche(tab.get(i));
        }
    }
    
    public static void triSelectionNomPrenom(Array<Personne> tab) {
        //pour chaque élément
        for(int i = 0; i < tab.size(); ++i) {
            //recherche du minimum "à droite"
            int indMin = i;
            for(int j = i + 1; j < tab.size(); ++j) 
                if(compareNomPrenom(tab.get(j), tab.get(indMin)) < 0)
                    indMin = j;
            
            //placement du minimum à sa place définitive
            Personne tmp = tab.get(i);
            tab.set(i, tab.get(indMin));
            tab.set(indMin, tmp);
        }
    }
    
    public static void triSelectionAge(Array<Personne> tab) {
        //pour chaque élément
        for(int i = 0; i < tab.size(); ++i) {
            //recherche du minimum "à droite"
            int indMin = i;
            for(int j = i + 1; j < tab.size(); ++j) 
                if(compareAge(tab.get(j), tab.get(indMin)) < 0)
                    indMin = j;
            
            //placement du minimum à sa place définitive
            Personne tmp = tab.get(i);
            tab.set(i, tab.get(indMin));
            tab.set(indMin, tmp);
        }
    }

    public static void exercice1() {
        Array<Personne> tab = new Array<>();
        saisie(tab);
        System.out.println("Tableau non trié : ");
        affiche(tab);
        System.out.println("Tableau trié par ordre lexicographique : ");
        triSelectionNomPrenom(tab);
        affiche(tab);
        System.out.println("Tableau trié par age : ");
        triSelectionAge(tab);
        affiche(tab);
    }

    
    public static void insertionTriée(Array<Personne> tab, Personne p) {
            tab.add(null);
            int k = tab.size() - 1;
            while(k > 0 && compareNomPrenom(p, tab.get(k - 1)) < 0) {
                tab.set(k, tab.get(k-1));  //déplacement vers la droite
                --k;                       //tant que p < tab.get(j - 1)
            }
            
            //insertion
            tab.set(k, p);
    }
    
    public static void saisieTriée(Array<Personne> tab) {
        System.out.println("Combien de personnes voulez-vous encoder ?");
        int nb;
        nb = in.nextInt();
        for (int i = 0; i < nb; ++i) {
            System.out.println("Encodez la personne " + (i + 1));
            Personne p = new Personne();
            saisie(p);
            insertionTriée(tab, p);
            System.out.println("Voilà le tableau dans son état actuel : ");
            affiche(tab);
        }
    }
    
    public static void exercice2() {
        Array<Personne> tab = new Array<>();
        saisieTriée(tab);
    }
    
    
    public static void main(String[] args) {
        //exercice1();
        exercice2();
    }

}
