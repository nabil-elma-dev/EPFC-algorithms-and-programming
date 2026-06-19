public class ex_1c {
    public static void main(String[] args) {

    /*
        00          04
           11    13
              22
           31    33
        40          44
    */
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < 5; ++column) {
                if (row == column || row + column == 4)
                    System.out.print('X');
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
