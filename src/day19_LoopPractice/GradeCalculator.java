package day19_LoopPractice;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter your score:");
            int score= scan.nextInt();
            if ((score>=0&&score<=100)){
                char result = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C'
                        : (score >= 60) ? 'D' : 'F';
                System.out.println(result);
                System.out.println("Would you like to calculate another grade? yes/no");
                String ans= scan.next().toLowerCase();
                while (!(ans.equals("yes")||ans.equals("no"))) {
                    System.err.println("Invalid Entry, please re-enter");
                    ans = scan.next().toLowerCase();
                }
                if (ans.equals("no")){
                    System.out.println("Thank you for using Cydeo Grade Calculator APP");
                    break;
                }
            }else{
                System.err.println("Invalid Entry");
                System.exit(0);
            }
        }
    }
}
