package day19_LoopPractice;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("Enter the radius of the circle");
            double radius = scan.nextDouble();
            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }else {
                System.out.println("Diameter of circle: " + radius * 2);
                System.out.println("Area of circle: " + 3.14 * radius * radius);
                System.out.println("Perimeter of circle: " + 2 * 3.14 * radius);
                System.out.println("Would you like to calculate another circle? yes/no");
                String ans = scan.next().toLowerCase();

                while (!(ans.equals("yes") || ans.equals("no"))) {
                    System.err.println("Invalid entry, please re-enter");
                    ans = scan.next().toLowerCase();
                }
                if (ans.equals("no")) {
                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
                    break;
                }
            }
        }
        scan.close();
    }
}
