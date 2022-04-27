package day28_ArrayList;

import java.util.ArrayList;

import java.util.Arrays;

public class Task_05_MaxNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println(max);

    }
}
