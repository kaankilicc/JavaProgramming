package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[]letters=new char[26];
        for (char i='A', j=0; i<='Z' && j<letters.length; i++,j++){//i:index numbers0~last index
            letters[j]=i;
        }
        System.out.println(Arrays.toString(letters));//[A~Z]
        System.out.println("-----------------------------------------");
        char[]letters2=new char[26];
        char ch='A';
        for (int i = 0; i < letters2.length; i++) {
            letters2[i]=ch++;
        }
        System.out.println(Arrays.toString(letters2));

    }
}
