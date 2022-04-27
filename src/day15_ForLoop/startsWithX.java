package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");
        String word= scan.next();

        if(word.charAt(0)=='x'){
        word=word.replaceFirst("x","a");

        } System.out.println("word = " + word);




    }
}
