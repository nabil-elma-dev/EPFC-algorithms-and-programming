import eu.epfc.prm3.Array;

public class ex_13 {
    public static void main() {
        Array<Integer> tab = new Array<>(4,7,5,2,4,3,7,8,2,8);
        System.out.println(tab);
        eraseDoublesRight(tab);
        System.out.println(tab);
        tab = new Array<>(4,7,5,2,4,3,7,8,2,8);
        eraseDoubleLeft(tab);
        System.out.println(tab);
    }

    public static void eraseDoubleLeft(Array<Integer> tab) {
        int nbTarget = 0;
        for (int i = tab.size() - 1; i >= 0; --i) {
            int currentValue = tab.get(i);
            int read = i - 1;
            int write = read;
            for (; read >= 0; --read) {
                if (tab.get(read) != currentValue) {
                    tab.set(write, tab.get(read));
                    -- write;
                } else {
                    ++ nbTarget;
                }
            }
            for (int l = 0; l < nbTarget; ++l) {
                ex_8.leftPermutation(tab);
            }
            tab.reduceTo(tab.size() - nbTarget);
            nbTarget = 0;
        }
    }

    public static void eraseDoublesRight(Array<Integer> tab) {
        int nbTarget = 0;
        for (int i = 0; i < tab.size(); ++i) {
            int currentValue = tab.get(i);
            int read = i + 1;
            int write = read;
            for (; read < tab.size(); ++read) {
                if (tab.get(read) != currentValue) {
                    tab.set(write, tab.get(read));
                    ++ write;
                } else {
                    ++ nbTarget;
                }
            }
            tab.reduceTo(tab.size() - nbTarget);
            nbTarget = 0;
        }
    }
}
