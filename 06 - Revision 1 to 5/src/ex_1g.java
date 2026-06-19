public class ex_1g {

/*

                    04
                 13 14
              22 23 24
           31 32 33 34
        40 41 42 43 44
*/

    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (row + column >= 4)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
