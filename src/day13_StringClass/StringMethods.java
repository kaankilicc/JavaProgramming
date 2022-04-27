package day13_StringClass;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String word="Cydeo";
             //index=01234

        char thirdChar=word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*char tenthChar=word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
        index number must be exist.
         */

        System.out.println("------------------------------------");

        String s1="Batch 25 is the best batch. Java programming language";

        int totalChar=s1.length();
        System.out.println("totalChar = " + totalChar);;

        char lastChar=s1.charAt(totalChar-1);//=s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------------------------------");

        String str="wooden spoon";
        str=str.toUpperCase();//"WOODEN SPOON"
        System.out.println(str);

        String sentence="Today is great day to learn java programming language.";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);

        String s="JAVA";
        s=s.toLowerCase();
        System.out.println(s);










    }
}
