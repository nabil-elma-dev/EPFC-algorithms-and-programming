import eu.epfc.prm3.Array;

public class ex_9 {
    public static void main() {
        Array<Integer> tab = new Array<>(2,7,6,8,8,5,3,8);
        System.out.println("Array: " + tab);
        rightPermutation(tab);
        System.out.println("Array after right permutation: " + tab);
    }

    public static void rightPermutation(Array<Integer> tab) {
        for (int i = tab.size() - 1; i > 0; --i) {
            int current = tab.get(i);
            tab.set(i, tab.get(i - 1));
            tab.set(i - 1, current);
        }
    }
}
