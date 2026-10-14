package prm2_15_recursivite_corrections;

import java.util.Scanner;

public class Recursivite_ex_12 {
    //pre : val >= 0
    public static void afficheALEnvers(int val){
        if(val < 10)
            System.out.println(val);
        else{
            System.out.print(val % 10);
            afficheALEnvers(val / 10);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Entrez un nombre positif : ");
        Scanner in = new Scanner(System.in);
        int nb = in.nextInt();
        System.out.print("Le revoilà dans l'autre sens : ");
        afficheALEnvers(nb);
    }
}
