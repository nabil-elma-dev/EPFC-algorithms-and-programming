public class ex_1f {

/*
    00 01 02 03 04
    10 11 12 13
    20 21 22
    30 31
    40
*/

    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (row + column <= 4)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
