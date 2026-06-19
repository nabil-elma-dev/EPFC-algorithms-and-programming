public class ex_1b {
    public static void main(String[] args) {

    /*
        00 01 02 03 04
        10          14
        20          24
        30          34
        40 41 42 43 44
    */

        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (row == 0 || row == 4 || column == 0 || column == 4)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


}
