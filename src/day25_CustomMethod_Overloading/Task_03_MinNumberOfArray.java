package day25_CustomMethod_Overloading;
import java.util.Arrays;
public class Task_03_MinNumberOfArray {
    // returns the min number for int array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for long array
    public static long min(long[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for short array
    public static short min(short[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for float array
    public static float min(float[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number for byte array
    public static byte min(byte[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

}
