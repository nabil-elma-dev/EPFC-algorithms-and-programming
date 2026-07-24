import eu.epfc.prm3.Array;

public class ex_7 {
    public static void main() {
        Array<Integer> tab = new Array<>(9,2,7,6,8,8,5,3,8);
        System.out.println("Array: " + tab);
        reversedArray(tab);
        System.out.println("Reversed array: " + tab);
    }

    public static void reversedArray(Array<Integer> tab) {
        int k = tab.size() - 1;
        for (int i = 0; i < tab.size() / 2; ++i) {
            int left = tab.get(k);
            tab.set(k, tab.get(i));
            tab.set(i, left);
            --k;
        }
    }
}
