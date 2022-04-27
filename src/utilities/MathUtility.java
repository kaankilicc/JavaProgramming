package utilities;

public class MathUtility {
    public static int sumOfTwoNumber(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static double sumOftwoNumber(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static int substractionOfTwoNumber(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static double substractionOfTwoNumber(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static int multiplicationOfTwoNumber(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static double multiplicationOfTwoNumber(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double division(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static boolean evenCheck(int num) {
        boolean result = (num % 2 == 0) ? true : false;
        return result;
    }

    public static boolean oddCheck(int num) {
        boolean result = (num % 2 != 0) ? true : false;
        return result;
    }

    public static int maxNumBetweenTwoNumber(int num1, int num2) {
        int result = 0;
        if (num1 > num2) {
            result = num1;
        } else if (num2 > num1) {
            result = num2;
        }
        return result;
    }

    public static double maxNumBetweenTwoNumber(double num1, double num2) {
        double result = 0;
        if (num1 > num2) {
            result = num1;
        } else if (num2 > num1) {
            result = num2;
        }
        return result;
    }

    public static int minNumBetweenTwoNumber(int num1, int num2) {
        int result = 0;
        if (num1 < num2) {
            result = num1;
        } else{
            result = num2;
        }
        return result;
    }

    public static double minNumBetweenTwoNumber(double num1, double num2) {
        double result = 0;
        if (num1 < num2) {
            result = num1;
        } else if (num2 < num1) {
            result = num2;
        }
        return result;
    }

    public static int squareOfNumber(int num){
        int result = num * num;
        return result;
    }

    public static double squareOfNumber(double num){
        double result = Math.pow(num,2);
        return result;
    }

    public static int cubeOfNumber(int num){
        int result = num * num * num;
        return result;
    }

    public static double cubeOfNumber(double num){
        double result = Math.pow(num,3);
        return result;
    }

}
