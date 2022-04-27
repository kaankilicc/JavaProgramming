package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        //>, >=, <, <=, ==, !=

        boolean result1=20>40; //false

        System.out.println("result1 = " + result1);

        boolean result2=300>=150;

        System.out.println("result2 = " + result2);

        boolean result3=100>=100;

        System.out.println("result3 = " + result3);

        boolean result4=300>=500;
        System.out.println("result4 = " + result4);

        //credit score of 720

        int creditScore=745;

        boolean isEligibleForLoan=creditScore>=720; //if the credit score is 720 or greater,then its eligible for the loan.

        boolean result5=100<120;//true
        System.out.println("result5 = " + result5);

        int score=59;
        boolean hasFailed= score<=59;

        System.out.println("hasFailed = " + hasFailed);

        boolean result7=45<=60;//true
        System.out.println("result7 = " + result7);

        System.out.println("-----------------------------------");

        int x=100;
        int y=200;

        boolean equal=x==y;//false
        System.out.println("equal = " + equal);

        boolean result8= "Muhtar" == "Good Guy";//false
        System.out.println("result8 = " + result8);

        boolean result9='A' == 'a';
        System.out.println("result9 = " + result9);

        boolean result10="Java"=="Java";
        System.out.println("result10 = " + result10);

        System.out.println("-------------------------------------");

        boolean result11=100!=200.5;
        System.out.println("result11 = " + result11);

        boolean resul12="Java"!="Break";//true
        System.out.println("resul12 = " + resul12);

        boolean result13=300!=300;//false
        System.out.println("result13 = " + result13);
    }
}
