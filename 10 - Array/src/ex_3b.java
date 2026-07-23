import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_3b {
    public static Scanner scan = new Scanner(System.in);
    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3);
        System.out.println("Array: " + tab);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.print("Enter the desired position: ");
        int pos = scan.nextInt();
        while (pos < 0 || pos >= tab.size()) {
            System.out.println("Invalid number; insert one between 0 and tab.size - 1");
            System.out.print("Enter the desired position: ");
            pos = scan.nextInt();
        }
        print(tab, n, pos);
    }

    public static void print(Array<Integer> tab, int n, int pos) {
        if (appearsFromPos(tab, n, pos)) {
            System.out.println("Number " + n + " has been found inside the array " + tab + " starting from position number " + pos);
        } else {
            System.out.println("Number " + n + " has not been found starting from position number " + pos);
        }
    }

    public static boolean appearsFromPos(Array<Integer> tab, int target, int pos) {
        while (pos < tab.size() && tab.get(pos) != target) {
            ++pos;
        }
        return pos != tab.size();
    }
}
