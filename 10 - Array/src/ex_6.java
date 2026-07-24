import eu.epfc.prm3.Array;

import java.util.Scanner;

public class ex_6 {
    public static Scanner scan = new Scanner(System.in);

    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3,8);
        System.out.println("Array: " + tab);
        System.out.println("This program swaps the position of two numbers");
        System.out.print("first chosen pos: ");
        int firstPos = insertValideNumber(tab, scan.nextInt());
        System.out.print("second chosen pos: ");
        int secondPos = insertValideNumber(tab, scan.nextInt());
        swapValues(tab, firstPos, secondPos);
        System.out.println("Array after edit: " + tab);
    }

    public static int insertValideNumber(Array<Integer> tab, int n) {
        while (n < 0 || n >= tab.size()) {
            System.out.println("Error: the number must be between 0 and tab.size() - 1");
            System.out.print("Chosen pos: ");
            n = scan.nextInt();
        }
        return n;
    }

    public static void swapValues(Array<Integer> tab, int pos1, int pos2) {
        int tmp = tab.get(pos1);
        tab.set(pos1, tab.get(pos2));
        tab.set(pos2, tmp);
    }

}
