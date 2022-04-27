package day24_CustomMethods_Return;

public class Task05 {
    public static void main(String[] args) {

        int[] arr = {2,4,3,8,2,4,9,5,2,1};
        int number = 2;
        frequencyOfNumber(arr,number);

    }

    public static int frequencyOfNumber(int[] arr,int number){
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if(number==arr[i]){
                frequency++;
            }
        }
        System.out.println(frequency);
        return frequency;
    }

}

