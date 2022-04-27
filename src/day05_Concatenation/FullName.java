package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Kaan";
        String lastName = "Kılıç";
        int age = 28;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName + ".");

        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + " and " + fullName + "'s salary is $" + salary + ".");
    }
}
