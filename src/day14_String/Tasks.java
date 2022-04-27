package day14_String;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word1= scan.next();
        String word2=scan.next();
        System.out.println(word1.substring(1)+word2.substring(1));

        System.out.println("-----------------------");

        String word= scan.next();
        String result="never mind";
        if (word.lastIndexOf("ly")==(word.length()-2)){result="really???";}
        System.out.println(result);

        System.out.println("------------------------");

        String w1= scan.next();
        String result1=scan.next();
        if (w1.indexOf("x")==0)
        {
            System.out.println(w1.substring(1));}


        System.out.println("---------------------------");

        String a=scan.next();
        String b=scan.next();
        if(a.charAt(a.length()-1)==b.charAt(0)){
            System.out.println(a+b.substring(1));
        }


    }
}
/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
 */


/*
Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */

/*
Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
/*
"ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind

 */




/*
 Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
