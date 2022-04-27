package day13_StringClass;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName=scan.next();

        System.out.println("Enter your last name");
        String lastName= scan.next();

        char f=firstName.charAt(0);
        char l=lastName.charAt(0);

        String initial=""+f+"."+l;

        System.out.println("initial="+initial);

        System.out.println("Enter your first user name");
        String s= scan.next();

        System.out.println("Enter your second user name");
        String s2=scan.next();

        char s3=s.charAt(0);
        char s4=s2.charAt(0);
        String userName=""+s3+"."+s4;
        System.out.println("user name = " + userName);





        /*
         write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
         */

    }
}
