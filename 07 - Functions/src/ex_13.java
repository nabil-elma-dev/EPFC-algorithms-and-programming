import java.util.Scanner;

public class ex_13 {
    public static Scanner scan = new Scanner(System.in);

    public static void afficheCarre(int hauteur) {
        for (int ligne = 0; ligne < hauteur; ++ligne) {
            for (int colonne = 0; colonne < hauteur; ++colonne)
                System.out.print("X ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println("This program draws a square n*n");
        System.out.print("Insert a number: ");
        int n = scan.nextInt();
        afficheCarre(n);
    }
}
