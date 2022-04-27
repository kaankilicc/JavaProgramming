package day27_WrapperClasses;

public class Task_01_Insert {
    // adds an element to given index and returns new array with one more length
    public static int[] insert(int[] array, int index, int newElement){
        int[] arr = new int[array.length+1];
        for (int i = 0, j=0; i < arr.length; i++) {
            if(i==index){
                arr[i] = newElement;
            }else{
                arr[i] = array[j++];
            }
        }
        return arr;
    }
    public static double[] insert(double[] array, int index, double newElement){
        double[] arr = new double[array.length+1];
        for (int i = 0, j=0; i < arr.length; i++) {
            if(i==index){
                arr[i] = newElement;
            }else{
                arr[i] = array[j++];
            }
        }
        return arr;
    }
    public static char[] insert(char[] array, int index, char newElement){
        char[] arr = new char[array.length+1];
        for (int i = 0, j=0; i < arr.length; i++) {
            if(i==index){
                arr[i] = newElement;
            }else{
                arr[i] = array[j++];
            }
        }
        return arr;
    }
    public static String[] insert(String[] array, int index, String newElement){
        String[] arr = new String[array.length+1];
        for (int i = 0, j=0; i < arr.length; i++) {
            if(i==index){
                arr[i] = newElement;
            }else{
                arr[i] = array[j++];
            }
        }
        return arr;
    }
}
