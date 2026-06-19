public class ex_1a {

/*
        00 01 02 03 04
        10 11 12 13 14
        20 21 22 23 24
        30 31 32 33 34
        40 41 42 43 44
*/

    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                System.out.print('X');
            }
            System.out.println();
        }
    }
}
