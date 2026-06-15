package pkg02_conditions;

import java.util.Scanner;

public class Exercice_12 {
    
    /*
    Si le même nombre apparait 3 fois, il est aussi affiché !
    Est-ce que vous aviez compris l‘énoncé ainsi ? 
    Est-ce que des 3 nombres entrés, deux d’entre eux ont la même valeur ? 
    Mais on pouvait comprendre autrement.
    Voyez comme le français est ambigü !
    Il faut reconnaître les cas spéciaux et chercher à préciser.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a == b || a == c)
            System.out.println(a);
        else if(b == c)
            System.out.println(b);
    }
}
