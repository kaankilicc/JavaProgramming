package day26_CustomMethodPractice;

import utilities.ArraysUtility3;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        array = removeElement(array, 1);
        //array = removeElement(array, 1);
        System.out.println(Arrays.toString(array));
    }
    public static int[]removeElement(int[]array,int index){
            if(index<0||index> array.length-1){
                System.err.println("Invalid Index: "+index);
                System.exit(0);
            }
        int[]result={};
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
               result=ArraysUtility3.addElement(result,array[i]);
            }
        }
            return result;

    }
}
