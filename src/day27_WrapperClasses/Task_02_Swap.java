package day27_WrapperClasses;

public class Task_02_Swap {
    // swaps the elements of given indexes and returns new array
    public static int[] swap(int[] array, int i, int j){
        int[] arr = new int[array.length];
        for (int k = 0; k < arr.length; k++) {
            if(k==i){
                arr[k] = array[j];
            }else if(k==j){
                arr[k] = array[i];
            }else{
                arr[k] = array[k];
            }
        }
        return arr;
    }

    // swaps the elements of given indexes and returns new array
    public static double[] swap(double[] array, int i, int j){
        double[] arr = new double[array.length];
        for (int k = 0; k < arr.length; k++) {
            if(k==i){
                arr[k] = array[j];
            }else if(k==j){
                arr[k] = array[i];
            }else{
                arr[k] = array[k];
            }
        }
        return arr;
    }

    // swaps the elements of given indexes and returns new array
    public static char[] swap(char[] array, int i, int j){
        char[] arr = new char[array.length];
        for (int k = 0; k < arr.length; k++) {
            if(k==i){
                arr[k] = array[j];
            }else if(k==j){
                arr[k] = array[i];
            }else{
                arr[k] = array[k];
            }
        }
        return arr;
    }

    // swaps the elements of given indexes and returns new array
    public static String[] swap(String[] array, int i, int j){
        String[] arr = new String[array.length];
        for (int k = 0; k < arr.length; k++) {
            if(k==i){
                arr[k] = array[j];
            }else if(k==j){
                arr[k] = array[i];
            }else{
                arr[k] = array[k];
            }
        }
        return arr;
    }
}
