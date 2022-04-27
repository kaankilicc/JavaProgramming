package day25_CustomMethod_Overloading;
import java.util.Arrays;
public class Task_02_MaxNumberOfArray {
    // returns the maximum number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the maximum number for double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the maximum number for long array
    public static long max(long[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the maximum number for short array
    public static short max(short[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the maximum number for float array
    public static float max(float[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // returns the maximum number for byte array
    public static byte max(byte[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
}
