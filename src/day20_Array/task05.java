package day20_Array;

import java.util.Arrays;

public class task05 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] reverse = new int[numbers.length];
        for(int i = numbers.length-1, j = 0; i >= 0; i--, j++){
            reverse[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
