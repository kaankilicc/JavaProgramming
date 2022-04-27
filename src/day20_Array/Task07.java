package day20_Array;

public class Task07 {
    public static void main(String[] args) {

        int[] numbers1 = {1,2,3,4,5};
        int[] numbers2 = {4,5,6,7,8};

        String result = "";
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if(numbers1[i]==numbers2[j]){
                    result+=numbers1[i]+" ";
                }
            }
        }
        System.out.println(result);
    }
}
