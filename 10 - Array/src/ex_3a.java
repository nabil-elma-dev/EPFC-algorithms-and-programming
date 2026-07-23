import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_3a {
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3);
        System.out.println("Array: " + tab);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        print(tab, n);
    }

    public static void print(Array<Integer> tab, int n) {
        if (appears(tab, n)) {
            System.out.println("Number " + n + " has been found inside the array " + tab);
        } else {
            System.out.println("Number " + n + " has not been found");
        }
    }

    public static boolean appears(Array<Integer> tab, int target) {
        int pos = 0;
        while (pos < tab.size() && tab.get(pos) != target) {
            ++pos;
        }
        return pos != tab.size();
    }
}
