public class ex_1h {

/*
     00 01 02 03 04
        11 12 13 14
           22 23 24
              33 34
                 44
*/

    public static void main(String[] args) {
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (column >= row)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
