package day08_IfStatements;

public class SwapToVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a=10;
        int b=15;

        int c=b;


        b=a;
        a=b;
        a=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
