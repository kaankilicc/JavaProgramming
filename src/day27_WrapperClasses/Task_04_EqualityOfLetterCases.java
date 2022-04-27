package day27_WrapperClasses;

public class Task_04_EqualityOfLetterCases {
    public static boolean equalityOfUpperLowerCase(String str) {
        int upperCase = 0, lowerCase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upperCase++;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                lowerCase++;
            }
        }
        return (upperCase == lowerCase) ? true : false;
    }
}
