public class ex_1e {
/*
    00
    10 11
    20 21 22
    30 31 32 33
    40 41 42 43 44
*/
    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (column <= row)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
