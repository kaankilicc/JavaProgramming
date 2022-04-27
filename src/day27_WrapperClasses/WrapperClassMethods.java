package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="123";
        int num=Integer.parseInt(str);//int
        System.out.println(num+1);//124
        System.out.println(str+1);//1231
        String str2="10.5";
        double num2=Double.parseDouble(str2);
        System.out.println(num2+1);
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1="true";//"!(true or false)"=====>>>>false
        boolean r1= Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("------------------------------");

        String s2="123";
        Integer x=Integer.valueOf(s2);
        System.out.println(x);
        int y=Integer.valueOf(s2);
        System.out.println(y);

        String s3="1.5";
        Double z=Double.valueOf(s3);
        System.out.println(z);

        System.out.println("------------------------------");

        //isDigit()
        char ch1='0';
        boolean r2=Character.isDigit(ch1);
        System.out.println(r2);
        //isLetter()
        char ch2='A';
        boolean r=Character.isLetter(ch2);
        System.out.println(r);
        //isLetterOrDigit====>isSpecial
        char ch3='!';
        boolean r3=!Character.isLetterOrDigit(ch3);
        System.out.println(r3);
        //upperCase
        char ch4='b';
        boolean r4=Character.isUpperCase(ch4);
        System.out.println(r4);
        //lowerCase
        char ch5='b';
        boolean r5=Character.isLowerCase(ch5);
        System.out.println(r5);

        System.out.println("------------------------------");
        
        String s="ab1cde2efg3hi4";
        int sum=0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);

    }

}
