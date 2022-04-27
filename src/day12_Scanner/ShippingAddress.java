package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your full name");
        String name=scan.nextLine();

        scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber=scan.next();

        scan.nextLine();

        System.out.println("Enter your street name");
        String name2=scan.nextLine();


        System.out.println("Enter your city name");
        String name3=scan.nextLine();

        scan.nextLine();

        System.out.println("Enter your state");
        String name4=scan.next();


        System.out.println("Enter your zip code");
        String name5= scan.next();

        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);
        System.out.println("name4 = " + name4);
        System.out.println("name5 = " + name5);

        scan.close();
    }
}
