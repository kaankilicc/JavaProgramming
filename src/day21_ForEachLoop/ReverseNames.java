package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names={"Cydeo School","Wooden Spoon","Java Programming","SQL Programming","Selenium Automation",
                "API Testing","Database Testing","Manuel Testing"};
        for (String name : names) {
            String reversed="";
            for (int i = name.length()-1; i >=0 ; i--) {
                reversed+=name.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
