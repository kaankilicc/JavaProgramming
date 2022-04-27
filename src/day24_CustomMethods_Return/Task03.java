package day24_CustomMethods_Return;

public class Task03 {
    public static void main(String[] args) {
        String str="wooden spoon";
        reverse(str);
    }

    public static String reverse(String str){
        String reverse = "";// contain the reversed version of string

        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i); // adding each character to the result
        }
        System.out.println(reverse);
        return reverse;
    }
}
