public class ex_1k {

/*
        00          04
        10 11    13 14
        20 21 22 23 24
        30 31    33 34
        40          44

           01 02 03
              12

              32
           41 42 43
*/

    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (row + column == 4 || row == column || row == 2 || column == 0 || column == 4)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
