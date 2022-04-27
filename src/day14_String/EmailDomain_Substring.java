package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {

        String email="Cydeo.School@gmail.com";
        String domain=email.substring(email.indexOf("@")+ 1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

        System.out.println("-------------------------------------");

        String sentence="Java is fun, Java is cool";

        String s1=sentence.substring(0,sentence.indexOf(","));
        System.out.println("s1 = " + s1);
        String s2=sentence.substring(sentence.lastIndexOf("J"));
        System.out.println("s2 = " + s2);





    }
}
