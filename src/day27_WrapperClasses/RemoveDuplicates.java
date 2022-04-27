package day27_WrapperClasses;

import utilities.ArraysUtility3;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[]arr={1,1,1,1,2,2,2,3,3,3,4,4,4,4};
        arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------");
        String[]words={"Java","Java","Python","C#","Java","Java"};
        words=removeDuplicates(words);
        System.out.println(Arrays.toString(words));
        System.out.println("----------------------------");
        int[]numbers={1,1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5};
        numbers=Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(numbers));
    }
    //                                  {1,1,2,2,3,3}
    public static int[]removeDuplicates(int[]array){
        int[]result={};//{1,2,3}
        for (int each : array) {
            if (!ArraysUtility3.contains(result,each)){
                result=ArraysUtility3.addElement(result,each);
            }
        }
        return result;
        
    }
    public static double[]removeDuplicates(double[]array){
        double[]result={};//{1,2,3}
        for (double each : array) {
            if (!ArraysUtility3.contains(result,each)){
                result=ArraysUtility3.addElement(result,each);
            }
        }
        return result;
    }
    public static char[]removeDuplicates(char[]array){
        char[]result={};//{1,2,3}
        for (char each : array) {
            if (!ArraysUtility3.contains(result,each)){
                result=ArraysUtility3.addElement(result,each);
            }
        }
        return result;
    }
    public static String[]removeDuplicates(String[]array){
        String[]result={};//{1,2,3}
        for (String each : array) {
            if (!ArraysUtility3.contains(result,each)){
                result=ArraysUtility3.addElement(result,each);
            }
        }
        return result;
    }
}
