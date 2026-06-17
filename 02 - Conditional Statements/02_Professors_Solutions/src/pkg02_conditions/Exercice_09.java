package pkg02_conditions;

import java.util.Scanner;

public class Exercice_09 {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrez 3 nombres: ");
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        int max;
//        if (a > b) 
//            if(a > c)
//                max = a;
//            else
//                max = c;
//        else
//            if(b > c)
//                max = b;
//            else
//                max = c;
//        System.out.println("Le maximum est " + max);
//    }
    
    /*
    Solution alternative
    On suppose que la 1ère valeur est la plus grande. 
    On compare avec la deuxième. Si elle est plus grande, on rectifie.
    On compare alors avec la troisième. Si elle est plus grande encore,
    on rectifie à nouveau.    
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        System.out.println("Le maximum est " + max);
    }

}
