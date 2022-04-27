package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 9.53;
        double euro = dollar * 0.86;
        double pound = dollar * 0.74;
        double riyal = dollar * 42.275;
        double peso = dollar * 796.43;
        //jpy,pound,peso,cad,riyal

        System.out.println("dollar = $" + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("pound = " + pound);
        System.out.println("riyal = " + riyal);
        System.out.println("peso = " + peso);

    }
}
