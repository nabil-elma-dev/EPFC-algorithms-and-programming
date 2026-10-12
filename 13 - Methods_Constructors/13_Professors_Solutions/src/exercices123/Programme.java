package exercices123;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class Programme {

    public static void exercice1() {
        Personne p1 = new Personne();
        Personne p2 = new Personne();

        System.out.println("Encodez une première personne : ");
        p1.saisie();

        System.out.println("Encodez une seconde personne : ");
        p2.saisie();

        System.out.println("Vous avez encodé les deux personnes suivantes : ");
        p1.affiche();
        p2.affiche();

        int cmpAge = p1.compareToAge(p2);
        if (cmpAge > 0) {
            System.out.print("La personne la plus agée est ");
            p1.affiche();
        } else if (cmpAge < 0) {
            System.out.print("La personne la plus agée est ");
            p2.affiche();
        } else {
            System.out.println("Les deux personnes sont nées le même jour");
        }

        int cmpNomPrenom = p1.compareToNomPrenom(p2);
        System.out.println("Dans l'ordre du bottin, ");
        if (cmpNomPrenom < 0) {
            p1.affiche();
            System.out.print(" est avant ");
            p2.affiche();
        } else if (cmpNomPrenom > 0) {
            p1.affiche();
            System.out.print(" est après ");
            p2.affiche();
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
            p.saisie();
            tab.add(p);
        }
    }

    public static void affiche(Array<Personne> tab) {
        for (int i = 0; i < tab.size(); ++i) {
            System.out.print("Personne " + (i + 1) + " : ");
            tab.get(i).affiche();
        }
    }

    public static void exercice2() {
        Array<Personne> tab = new Array<>();
        saisie(tab);
        affiche(tab);
    }

    public static Personne trouveLaPlusJeune(Array<Personne> tab) {
        if (tab.size() == 0) 
            throw new Error("Pas de bras, pas de chocolat");
        
        Personne min = tab.get(0);
        
        for (int i = 1; i < tab.size(); ++i)
            if (tab.get(i).compareToAge(min) < 0)
                min = tab.get(i);
        
        return min;
    }

    public static void exercice3() {
        Array<Personne> tab = new Array<>();
        saisie(tab);

        System.out.println("La personne la plus jeune est : ");
        Personne p = trouveLaPlusJeune(tab);
        p.affiche();
    }

    public static void main(String[] args) {
        exercice1();
        //exercice2();
        //exercice3();
    }

}
