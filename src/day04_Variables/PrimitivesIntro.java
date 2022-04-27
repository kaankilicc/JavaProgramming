package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age:28 years old
        byte age = 28;

        //weight:160 pounds
        //byte weight = 160; 160 is out of byte' range
        //byte num = -129; 129 is out of byte' range
        short weight = 160;

        //salary: 100000 $
        //short salary = 100000; //100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers

        //int asset = 3_333_333_333; this number is out of the int' range
        long asset = 3_333_333_333L;

        //tax:0.26
        float tax = 0.26f;

        double PI = 3.14;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 131;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println(gender);

        char yesNo = 'Y';
        System.out.println(yesNo);

        boolean isEmployeed = true;
        System.out.println("isEmployeed = " + isEmployeed);
        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);

        boolean result = 100 > 200;
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        System.out.println("name = " + name);
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);








    }


}
