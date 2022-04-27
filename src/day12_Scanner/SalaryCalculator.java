package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        int hourlyRate= scan.nextInt();

        System.out.println("Enter your weekly hours:");
        int weeklyHours= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your state tax:");
        double stateTax= scan.nextDouble();

        System.out.println("Enter your federal tax:");
        double federalTax= scan.nextDouble();

        System.out.println("Salary : " +(hourlyRate*weeklyHours*52));
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("Total tax : " +stateTax+federalTax);
        System.out.println("Net income : "+((hourlyRate*weeklyHours*52)-(stateTax+federalTax)));





    }
}
/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */
