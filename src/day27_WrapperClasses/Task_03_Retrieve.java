package day27_WrapperClasses;

public class Task_03_Retrieve {
    // retrieves letter, digits and special chars from given String
    public static void retrieve(String str){
        String letters = "", digits = "", specialChars = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                letters += str.charAt(i);
            }else if(Character.isDigit(str.charAt(i))){
                digits += str.charAt(i);
            }else{
                specialChars += str.charAt(i);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
