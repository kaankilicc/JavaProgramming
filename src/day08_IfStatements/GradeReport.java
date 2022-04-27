package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score=85;

        boolean a=score>=90&& score<=100;
        boolean b=score<=89&& score>=80;
        boolean c=score>=70&&score<=79;//boolean c=!a && !b && score>=70
        boolean d=score<=69&&score>=60;
        boolean f=score<=59&&score>=0; // boolean f= !a && !b && !c && !d

        if(a){
            System.out.println("Excellent");
        }
        if(b) {
            System.out.println("Great");
        }
        if(c) {
            System.out.println("Good");
        }
        if(d) {
            System.out.println("Passed");
        }
        if(f) {
            System.out.println("Failed");
        }

        System.out.println("--------------------------------");

    }
}

/*
90-100= excellent
80-89=great
70-79=good
60-69=passed
0-59=failed

 */
