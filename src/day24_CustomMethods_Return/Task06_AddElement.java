package day24_CustomMethods_Return;
import java.util.Arrays;
public class Task06_AddElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int number = 6;
        addElement(arr,number);
    }

    public static int[] addElement(int[] arr,int number){
        int[] arr1 = Arrays.copyOf(arr,arr.length+1);// We create a new array with one extra element([1,2,3,4,5,0])
        arr1[arr1.length-1] = number; // assign the new last element of new array
        System.out.println(Arrays.toString(arr1));
        return arr1;
    }
}
