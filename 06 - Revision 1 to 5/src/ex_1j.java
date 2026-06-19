public class ex_1j {

/*
      00 01 02 03 04
         11 12 13
            22
         31 32 33
      40 41 42 43 44
*/

    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (row + column == 4 || row == column || row == 0 || row == 4 || column == 2)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
