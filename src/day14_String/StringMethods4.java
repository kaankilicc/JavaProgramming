package day14_String;

import java.sql.SQLOutput;

public class StringMethods4 {
    public static void main(String[] args) {

        String str="Cydeo";

        String str2 =str.repeat(4);//"CydeoCydeoCydeoCydeo"
        System.out.println(str2);

        String s1="Wooden Spoon ";
        s1=s1.repeat(100);
        System.out.println(s1);

        boolean a=s1.equals(str2);
        System.out.println(a);

        System.out.println("--------------------------------");

        System.out.println("Fady\n".repeat(25));

        System.out.println("--------------------------------");

        System.out.println("Java ".repeat(5));

        String name="Java";
        System.out.println( (name+" ").repeat(5));



    }
}
