package pkg02_conditions;

public class Exercice_07 {

    public static void main(String[] args) {
        int a, b, c;
        boolean test1, test2, test3, arret;
        a = 2;
        System.out.println("a = " + a);
        b = 3;
        System.out.println("a = " + a + ", b = " + b);
        c = 4;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        test1 = true;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1);
        test2 = (b >= a) && (c >= b);
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2);
        test3 = test1 || test2;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3);
        arret = test3 && (!test2);
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3 + ", arret = " + arret);
        a += 1;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3 + ", arret = " + arret);
        b -= 1;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3 + ", arret = " + arret);
        c -= 2;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3 + ", arret = " + arret);
        test1 = true;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3 + ", arret = " + arret);
        test2 = (b >= a) && (c >= b);
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3 + ", arret = " + arret);
        test3 = test1 || test2;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3 + ", arret = " + arret);
        arret = arret || test2;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(", test1 = " + test1 + ", test2 = " + test2 + 
                ", test3 = " + test3 + ", arret = " + arret);
    }

}
