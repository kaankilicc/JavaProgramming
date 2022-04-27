package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

    int[]numbers={10,5,4,20,1,0};
    int max=numbers[0];//assume the first number is max number
        /*for (int i = 0; i < numbers.length; i++) {
        if (numbers[i]>max){//if there is element int the array that's greater than current max number
            max=numbers[i];
        }
    }

         */
        for (int number : numbers) {
            if (number>max){
                max=number;
            }
        }
        System.out.println(max);
}
}

