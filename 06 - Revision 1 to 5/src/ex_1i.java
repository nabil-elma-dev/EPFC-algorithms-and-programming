public class ex_1i {

/*
             04
          13 14 15
       22 23 24 25 26
    31 32 33 34 35 36 37
 40 41 42 43 44 45 46 47 48
*/
    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 9; ++column) {
                if (column == 4
                        || (row + column > 3 && column < 4)
                        || (column - row <= 4 && column > 4)
                )
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
