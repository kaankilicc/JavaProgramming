package day19_LoopPractice;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter the side of square:");
            double side= scan.nextDouble();
            if (side<=0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }else{
                System.out.println("Area of square: "+side*side);
                System.out.println("Perimeter of square: "+side*4);
                System.out.println("Would you like to calculate another circle? yes/no");
                String ans= scan.next().toLowerCase();
             while (!(ans.equals("yes")||ans.equals("no"))){
                 System.err.println("Invalid Entry, please re-enter");
                 ans= scan.next().toLowerCase();
             }
             if (ans.equals("no")){
                 System.out.println("Thank you for using Cydeo Circle Calculator APP");
                 break;
             }

            }
        }
    }
}
