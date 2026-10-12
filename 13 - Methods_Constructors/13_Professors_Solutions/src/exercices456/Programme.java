package exercices456;

import eu.epfc.prm3.Array;
import java.util.Scanner;

public class Programme {

    
    public static void main(String[] args) {
        Date d1 = new Date(25, 3, 2018);
        Date d2 = new Date(13, 4, 1984);
        d1.affiche();
        System.out.println(d1);
        d2.affiche();
        System.out.println(d2);
        Personne p1 = new Personne("Dupont", "Wilbur", 1, 4, 1974);
        p1.affiche();
        System.out.println(p1);
        
        System.out.println("il a " + p1.getAge() + " ans.");
        
        Personne p2 = new Personne("Durand", "Paul", 1, 3, 1990);
        System.out.println(p2);
        
        System.out.println("il a " + p2.getAge() + " ans.");      
    }

}
