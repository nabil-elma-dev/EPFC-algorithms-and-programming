import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_04 {
    public static Scanner scan = new Scanner(System.in);
    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3,8);
        System.out.println("Array: " + tab);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        print(tab, n);
    }

    public static void print(Array<Integer> tab, int n) {
        if (firstAppearence(tab, n) == tab.size()) {
            System.out.println("Number" + n + " has not been found.");
        } else {
            System.out.println("Number " + n + " appears for the first time at position number " + firstAppearence(tab, n));
        }
    }

    public static int firstAppearence(Array<Integer> tab, int target) {
        int pos = tab.size();
        int step = 0;
        while (step < tab.size() && target != tab.get(step)){
            ++step;
        }
        pos = step;
        return pos;
    }
}
