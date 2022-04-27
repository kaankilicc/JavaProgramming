package day17_While_DoWhile;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str="AAABBBC";
        char ch='A';

        int frequency=0;
        for (int i = 0; i < str.length(); i++) {
            char eachChar=str.charAt(i);// each character of str

            if(ch==eachChar){
                frequency++;//=======>frequency+=1;
            }
        }
        System.out.println(frequency);


    }
}
