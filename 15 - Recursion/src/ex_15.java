import eu.epfc.prm3.Array;

public class ex_15 {
    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(3,2,8,7,4,4,2);
        System.out.println(greatestNumber(tab));
    }

    public static int greatestNumber(Array<Integer> tab) {
        int pos = tab.size() - 1;
        int currentMax = tab.get(pos);
        return scrollTab(tab, tab.size() - 1, currentMax);
    }

    public static int scrollTab(Array<Integer> tab, int pos, int currentMax) {
        if (pos == 0) {
            return tab.get(pos) >  currentMax ?
                    tab.get(pos)
                    : currentMax;
        } else {
            return tab.get(pos) >  currentMax ?
                    scrollTab(tab, pos - 1, tab.get(pos))
                    : scrollTab(tab, pos - 1, currentMax);
        }
    }

    public static int maxValue(Array<Integer> tab) {
        return maxValue(tab, 0);
    }

    public static int maxValue(Array<Integer> tab, int pos) {
        if (pos == tab.size() - 1) {
            return tab.get(pos);
        } else {
        return Math.max(tab.get(pos), maxValue(tab, pos + 1));
        }
    }
}
