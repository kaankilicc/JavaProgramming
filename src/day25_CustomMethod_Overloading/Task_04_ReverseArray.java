package day25_CustomMethod_Overloading;
import java.util.Arrays;
public class Task_04_ReverseArray {
    // reverse an int array
    public static int[] reverseArray(int[] numbers){
        int[] reverse = new int[numbers.length];
        for(int i = numbers.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=numbers[i];
        }
        return reverse;
    }

    // reverse a double array
    public static double[] reverseArray(double[] numbers){
        double[] reverse = new double[numbers.length];
        for(int i = numbers.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=numbers[i];
        }
        return reverse;
    }

    // reverse a char array
    public static char[] reverseArray(char[] ch){
        char[] reverse = new char[ch.length];
        for(int i = ch.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=ch[i];
        }
        return reverse;
    }

    // reverse a String array
    public static String[] reverseArray(String[] str){
        String[] reverse = new String[str.length];
        for(int i = str.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=str[i];
        }
        return reverse;
    }

}
