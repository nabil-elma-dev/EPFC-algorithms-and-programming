
package pkg02_conditions;

import java.util.Scanner;

public class Exercice_13 {

    public static void main(String[] args) {
        System.out.print("Quelle est l'heure actuelle (en h et m): ");
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        if(m == 59) {
            ++h;
            m = 0;
        }
        else
            ++m;
        System.out.println("Une minute après il est: " + h + "h" + m);
    }

//    /*
//    Une solution alternative s'inspire de l'algèbre modulo 60 utilisée dans
//    l'exercice 13 du labo 01 pour ne pas utiliser de condition
//    */
//    public static void main(String[] args) {
//        System.out.print("Quelle est l'heure actuelle (en h et m): ");
//        Scanner scan = new Scanner(System.in);
//        int h = scan.nextInt();
//        int m = scan.nextInt();
//        int instantEnMinutes = 60 * h + m;
//        ++instantEnMinutes;                // Une minute en plus
//        System.out.println("Une minute après il est: " + 
//                instantEnMinutes / 60 + "h" + instantEnMinutes % 60);
//    }

}

