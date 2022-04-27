package day25_CustomMethod_Overloading;

import utilities.ArraysUtility3;

public class Test2 {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        ArraysUtility3.printEachElement(arr1);
        System.out.println("----------------------------------");
        double[]arr2={1.5,2.5,3.5,4.5};
        ArraysUtility3.printEachElement(arr2);
        System.out.println("----------------------------------");
        char[]arr3={'A','B','C','D'};
        ArraysUtility3.printEachElement(arr3);
        System.out.println("----------------------------------");
        String[]arr4={"Who","Dares","To","Look","At","The","Stars"};
        ArraysUtility3.printEachElement(arr4);
        System.out.println("----------------------------------");
        int[]n1={1,2,3,4,5,6};
        int max1=ArraysUtility3.max(n1);
        System.out.println(max1);
        System.out.println("----------------------------------");
        double[]n2={1.5,2.5,3.5,4.5};
        double max2=ArraysUtility3.max(n2);
        System.out.println(max2);
        System.out.println("----------------------------------");
        int[]a1={1,2,3,4,5,6};
        int min1=ArraysUtility3.min(a1);
        System.out.println(min1);
        System.out.println("----------------------------------");
        int[]a2={1,2,3,4,5,6,7};
        boolean r1=ArraysUtility3.contains(a2,5);
        System.out.println(r1);
    }
}