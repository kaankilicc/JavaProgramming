package day14_String;

public class EmailTask {
    public static void main(String[] args) {

        String email="mike_tyson@gmail.com";
        String firstName=email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("t"),email.indexOf("@"));
        String rest=email.substring(email.indexOf("@"));

        email=firstName+"_"+lastName+rest;
        System.out.println(email);



    }
}
