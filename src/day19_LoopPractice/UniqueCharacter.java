package day19_LoopPractice;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result="";
        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            int count=0;//represent the frequency of the char
            for (int i = 0; i < str.length(); i++) {//compares the characters that outer loop picked, with each character of the string
                char each=str.charAt(i);
                if (ch==each){
                    count++;
                }
            }
            if (count==1){//if the frequency of the character is, then the char is unique
                result+=ch;
            }
            /*
            if(count!=1){===========================>solution2.
                continue;
            }
             */
        }
        System.out.println(result);
    }
}
/*
Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */