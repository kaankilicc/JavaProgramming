package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_06_MinNumber {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        int min= numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)<min){
                min=numbers.get(i);
            }
        }
        System.out.println("min = " + min);
    }
}
