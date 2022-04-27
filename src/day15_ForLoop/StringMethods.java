package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str=" ";

        boolean r=str.isEmpty();
        System.out.println(r);

        boolean r1=str.isBlank();
        System.out.println(r1);

        String str2="Cydeo     ";
        boolean r2=str2.isBlank();
        System.out.println(r2);

        System.out.println("-----------------------------------------");

        String s1="CYDEO";
        String s2="cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("-----------------------------------------");

        String sentence="My favorite programming language is Java";
        boolean hasCSharp =sentence.contains("C#");
        System.out.println(hasCSharp);
        boolean hasJava=sentence.contains("java");
        System.out.println(hasJava);
        boolean hasJava2=sentence.contains("Java");
        System.out.println(hasJava2);
        boolean hasJava3=sentence.toLowerCase().contains("java");
        System.out.println(hasJava3);
        boolean r3=sentence.contains("java")||sentence.contains("Java");
        System.out.println(r3);

        System.out.println("-------------------------------------------");

        String input1="I love Java";
        String input2="Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains("Java"));

        System.out.println("-------------------------------------------");

        String a="Wooden Spoon";
        boolean x=a.startsWith("Woo");
        System.out.println(x);
        boolean y=a.endsWith("Spoon");
        System.out.println(y);
        boolean z=a.toLowerCase().startsWith("wooden");
        System.out.println(z);






    }
}
