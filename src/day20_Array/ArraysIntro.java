package day20_Array;

import java.util.Arrays;

public class ArraysIntro  {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names
    String[]myGroup=new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";
        //System.out.println(myGroup);//hashcode
    System.out.println(Arrays.toString(myGroup));//["Gunay","Neira","Suat","Hulya","Mikael"]
        System.out.println("--------------------------------------------------------------");
        String[]days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));
        int num=5;
        if (num<1||num>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[num-1]);
    }
}
