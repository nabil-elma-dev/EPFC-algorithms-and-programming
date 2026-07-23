import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_5 {
    public static Scanner scan = new Scanner(System.in);
    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3,8);
        System.out.println("Array: " + tab);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        print(tab, n);
    }

    public static void print(Array<Integer> tab, int n) {
        if (lastAppearence(tab, n) == tab.size()) {
            System.out.println("Number" + n + " has not been found.");
        } else {
            System.out.println("Number " + n + " appears for the last time at position number " + lastAppearence(tab, n));
        }
    }

    public static int lastAppearence(Array<Integer> tab, int target) {
        int pos = tab.size();
        for (int i = 0; i < tab.size(); ++i) {
            if (tab.get(i) == target) {
                pos = i;
            }
        }
        return pos;
    }
}
