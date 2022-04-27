package day13_StringClass;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Do you hava a valid passport");
        boolean hasValidPassport= scan.nextBoolean();
        int cost =0;

        if(hasValidPassport){
            cost+=1000;

            System.out.println("Which country are you going to travel?");
            String country= scan.nextLine();
            scan.nextLine();
            System.out.println("How many bags they will take with them");
            byte numberOfBags= scan.nextByte();
            cost+=numberOfBags*50;
            scan.nextLine();
            System.out.println("How many people they will travel with");
            short numberOfPeople=scan.nextShort();
            if (numberOfPeople <= 3) {
                cost -= numberOfPeople * 100;
            } else {
                cost -= 300;
            }
            System.out.println("Enter the name of the people you will travel with?");
            String namesTravelWith = scan.nextLine();
            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + numberOfBags +
                    " bags but you are traveling with " + namesTravelWith + " so we are giving a discount. " +
                    "Your total cost is " + cost);



        }



    }
}
