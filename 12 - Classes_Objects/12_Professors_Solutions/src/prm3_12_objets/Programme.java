package prm3_12_objets;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class Programme {

    public static void saisie(Date d) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un jour : ");
        d.jour = in.nextInt();
        System.out.print("Entrez un mois : ");
        d.mois = in.nextInt();
        System.out.print("Entrez une année : ");
        d.annee = in.nextInt();
    }

    public static void saisie(Personne p) {
        Scanner in = new Scanner(System.in);
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
    //20180322 20180000 + 300 + 22 
    public static int compare(Date d1, Date d2) {
        
        return (d1.annee * 10000 + d1.mois * 100 + d1.jour)
                - (d2.annee * 10000 + d2.mois * 100 + d2.jour);
    }

    public static int compareAge(Personne p1, Personne p2) {
        return -compare(p1.ddn, p2.ddn); //l'ordre des dates est l'inverse
        //de l'ordre des ages
    }

    public static int compareNomPrenom(Personne p1, Personne p2) {
        return (p1.nom + " " + p1.prenom).compareToIgnoreCase(p2.nom + " " + p2.prenom);
    }

    public static void exercice1() {
        Personne p1 = new Personne();
        Personne p2 = new Personne();

        System.out.println("Encodez une première personne : ");
        saisie(p1);

        System.out.println("Encodez une seconde personne : ");
        saisie(p2);

        System.out.println("Vous avez encodé les deux personnes suivantes : ");
        affiche(p1);
        affiche(p2);

        int cmpAge = compareAge(p1, p2);
        if (cmpAge > 0) {
            System.out.print("La personne la plus agée est ");
            affiche(p1);
        } else if (cmpAge < 0) {
            System.out.print("La personne la plus agée est ");
            affiche(p2);
        } else {
            System.out.println("Les deux personnes sont nées le même jour");
        }

        int cmpNomPrenom = compareNomPrenom(p1, p2);
        System.out.println("Dans l'ordre du bottin, ");
        if (cmpNomPrenom < 0) {
            affiche(p1);
            System.out.print(" est avant ");
            affiche(p2);
        } else if (cmpNomPrenom > 0) {
            affiche(p1);
            System.out.print(" est après ");
            affiche(p2);
        } else {
            System.out.println("les deux personnes sont à la même place.");
        }

    }

    public static void saisie(Array<Personne> tab) {
        Scanner in = new Scanner(System.in);
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

    public static void exercice2() {
        Array<Personne> tab = new Array<>();
        saisie(tab);
        affiche(tab);
    }

    public static Personne trouveLaPlusJeune(Array<Personne> tab) {
        if (tab.size() == 0) 
            throw new RuntimeException("Tableau vide ; pas de minimum");
        
        Personne min = tab.get(0);
        
        for (int i = 1; i < tab.size(); ++i)
            if (compareAge(tab.get(i), min) < 0)
                min = tab.get(i);
        
        return min;
    }

    public static void exercice3() {
        Array<Personne> tab = new Array<>();
        saisie(tab);

        System.out.println("La personne la plus jeune est : ");
        Personne p = trouveLaPlusJeune(tab);
        affiche(p);
    }

    public static void main(String[] args) {
        //exercice1();
        //exercice2();
        exercice3();
    }

}
