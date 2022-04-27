package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str="Wooden Spoon";

        String result="";//contain the reversed version of str

        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }


        System.out.println(result);

        System.out.println();

        System.out.println("-----------------------------------");

        String sentence="I love Java, Java is fun programming language";

        String r="";
        for (int i = sentence.length()-1; i >=0 ; i--) {
            r+=sentence.charAt(i);

        }
        System.out.println(r);


    }
}
