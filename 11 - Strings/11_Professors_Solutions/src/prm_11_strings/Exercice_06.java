package prm_11_strings;

import java.util.Scanner;

public class Exercice_06 {

    public static String copieALEnvers(String s) {
        String res = "";
        for (int k = s.length() - 1; k >= 0; --k) {
            res += s.charAt(k);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = in.next();
        System.out.println("Le mot \"" + mot + " à  l'envers : " + copieALEnvers(mot));
    }
}
