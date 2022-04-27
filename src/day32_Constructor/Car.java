package day32_Constructor;

public class Car {

    public Car (){
        System.out.println("Volvo");
    }
    public Car(int a){
        this();
        System.out.println("XC90");
    }
    public Car(double b){
        this(3);
        System.out.println("2021");
    }
    public Car(String c){
        this(3.3);
        System.out.println("$100000");
    }
    public Car(char d){
        this("Volvo");
        System.out.println("Black");
    }

    public static void main(String[] args) {
        new Car('V');

    }
}
