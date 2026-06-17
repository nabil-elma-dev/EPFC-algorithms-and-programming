
package pkg01_assignations;

import java.util.Scanner;

public class Exercice_07 {
    
    /*
    
    Le programme, sans utiliser de variable intermédiaire, échange les valeurs
    de a et b par arithméthique. Comprenez-vous comment?
    
    Comprenez-vous mieux si vous analysez le code comme suit:
    1) La nouvelle valeur de a est la somme des valeurs de départ de a et de b
    2) La nouvelle valeur de b est la nouvelle valeur de a, 
       cad cette somme (a_depart + b_depart) moins
       l'ancienne valeur de b. Donc la valeur de départ de a
    3) a est de nouveau changé. Sa nouvelle valeur est cette même somme moins
       la nouvelle valeur b (qui vaut celle de départ de a, voir point 2).
       Donc le a final vaut le b de départ
    Au final, a vaut le b de départ et b vaut le a de départ
    Tout ça n'est possible que si les opérations arithmétiques ne produisent pas
    de "dépassement de capacité" erreur qui serait due à des nombres trop grands 
    */

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        
        a = a + b;           // 1)
        b = a - b;           // 2)
        a = a - b;           // 3)
        
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);        
    }

}



























