package day23_CustomMethods_Void;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        oddNumbers();
        System.out.println();
        evenNumbers();
        System.out.println();
        isEligibleToBuyAlcohol(28);
        isEligibleToVote(28,"Turkey");
        grade(78);
        isAnagram("Kaan","Elif");
    }
    public static void oddNumbers(){
        for (int i = 1; i < 100; i+=2) {
            System.out.print(i+" ");
        }
    }
    public static void evenNumbers(){
        for (int i = 0; i < 100; i+=2) {
            System.out.print(i+" ");
        }
    }
    public static void isEligibleToBuyAlcohol(int age){
        if (age>=21){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void isEligibleToVote(int age,String citizen){
        if (age>=18&&citizen=="USA"){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void grade(int score){
        if(score>=0&&score<=100){
            String result="";
            if(score>=90){
                result="Excellent";
            }else if(score>=80){
                result="Great";
            }else if(score>=70){
                result="Good";
            }else if(score>=60){
                result="Passed";
            }else{
                result="Failed";
            }
            System.out.println(result);
        }
    }
    public static void isAnagram(String word1,String word2){
        char[]ch1=word1.toCharArray();
        Arrays.sort(ch1);
        char[]ch2=word2.toCharArray();
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            System.out.println(word1+" and "+word2+" is anagram");
        }else{
            System.out.println(word1+" and "+word2+" is not anagram");
        }
    }
}
