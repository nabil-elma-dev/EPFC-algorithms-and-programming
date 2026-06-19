public class ex_1d {

/*
       01 02 03
    10    12    14
    20 21    23 24
    30    32    34
       41 42 43
*/
    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (row != column && row + column != 4)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
