package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    //create a function that can print hello world 5 times
    //create a function that can print hello Cydeo 5 times
    //create a function that can print all the even numbers 1~10
    public static void main(String[] args) {
        helloWorld();
        System.out.println("-------------------------------");
        helloCydeo();
        System.out.println("-------------------------------");
        evenNumbers();
    }
    public static void helloWorld(){
        for (int i = 0; i <5; i++) {
            System.out.println("Hello World");
        }

    }
    public static void helloCydeo(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }

    }
    public static void evenNumbers(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.println(i);
        }
    }
}
