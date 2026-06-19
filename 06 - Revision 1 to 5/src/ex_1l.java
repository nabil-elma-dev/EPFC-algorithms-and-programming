public class ex_1l {

/*

1234554321
 12344321
  123321
   1221
    11
*/
    public static void main(String[] args) {
        int paramIncrease = 4;
        int paramDecrease = 0;
        int moveToRight = 0;
        int value = 1;
        for (int row = 0; row < 5; ++row) {
            for (int columnOnLeft = paramDecrease; columnOnLeft <= paramIncrease; ++columnOnLeft) {
                System.out.print(value);
                ++value;
            }

            for (int columnOnRight = paramIncrease; columnOnRight >= paramDecrease; --columnOnRight) {
                -- value;
                System.out.print(value);
            }

            ++paramDecrease;
            System.out.println();
            ++moveToRight;
            for (int i = 0; i < moveToRight; ++i) {
                System.out.print(" ");
            }
        }
    }
}
