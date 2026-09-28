package prm_11_strings;

public class Exercice_07 {

    //Solution naîve et inefficace car va parcourir deux fois 
    //la chaine 's' (une pour copieALEnvers et une pour equals).
    //Va aussi utiliser deux fois plus de mémoire que la solution proposée
    
//    public static boolean estPalindrome(String s){
//        return Exercice_06.copieALEnvers(s).compareTo(s) == 0;
//    }
    
        
    //Solution plus efficace : n'utilise pas de mémoire temporaire
    //et ne parcours que la moitié de la chaine 's'
    public static boolean estPalindrome(String s) {
        int g = 0, d = s.length() - 1;
        while (g < d && s.charAt(g) == s.charAt(d)) {
            ++g;
            --d;
        }
        return g >= d;
    }

    //Solution alternative toute aussi efficace
    /*
    public static boolean estPalindrome(String s) {
        for (int k = 0; k < s.length() / 2; ++k) {
            if (s.charAt(k) != s.charAt(s.length() - k - 1)) {
                return false;
            }
        }
        return true;
    }
     */
    
    public static void main(String[] args) {
        String s = "radar";
        if (estPalindrome(s)) {
            System.out.println(s + " est un palindrome");
        } else {
            System.out.println(s + " n'est pas un palindrome");
        }

        s = "hello";
        if (estPalindrome(s)) {
            System.out.println(s + " est un palindrome");
        } else {
            System.out.println(s + " n'est pas un palindrome");
        }
    }
}
