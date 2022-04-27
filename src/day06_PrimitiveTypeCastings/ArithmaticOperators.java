package day06_PrimitiveTypeCastings;

public class ArithmaticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1);

        System.out.println(10 + 20);
        System.out.println(100 - 50);
        System.out.println(10*5);
        System.out.println(100/3);//33
        System.out.println((double)10/4);//2.5
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10d/4);//2.5
        //integer / integer = integer
        //decimal /integer = decimal
        //integer / decimal =decimal
        //decimal / decimal =decimal

        int a = 100;
        double b = a/6;
        System.out.println(b);

        double c = a/6.0;
        System.out.println(c);


    }


}


/*
+: addition
-:subtract
*:multiplication
/:division
%:remainder
 */
