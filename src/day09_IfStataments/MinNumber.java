package day09_IfStataments;

public class MinNumber {
    public static void main(String[] args) {

        int num1=100;
        int num2=200;

        boolean num1IsMin=num1<num2;
        boolean num2IsMin=num2<num1;
        boolean num1IsEqualNum2=num1==num2;

        if(num1<num2){
            System.out.println(num1+" is minimum number");
        }

        if(num2<num1){
            System.out.println(num2+" is minimum number");
        }

        if(num1==num2){
            System.out.println("Equal");
        }


    }
}
