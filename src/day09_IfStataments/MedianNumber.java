package day09_IfStataments;

public class MedianNumber {
    public static void main(String[] args) {

        int n1=10,n2=15,n3=20;

        boolean n1IsMedianNumber=(n1>n2&&n1<n3) || (n1<n2&&n1>n3);
        boolean n2IsMedianNumber=(n2>n1&&n2<n3) || (n2<n1&&n2>n3);
        boolean n3IsMedianNumber=(n3<n1&&n3>n2)||(n3>n1&&n3<n2); //!n1IsMedianNumber&&!n2IsMedianNumber;

        if(n1IsMedianNumber){
            System.out.println(n1+" is median number");
        }

        if(n2IsMedianNumber){
            System.out.println(n2+" is median number");
        }

        if(n3IsMedianNumber){
            System.out.println(n3+" is median number");
        }
    }
}
