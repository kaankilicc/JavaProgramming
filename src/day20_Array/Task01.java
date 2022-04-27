package day20_Array;

public class Task01 {
    public static void main(String[] args) {

        String[] classmates = {"Yasin Karadağ", "Ali Cimen", "Ekrem Mus", "Erol Aksel", "Suleyman Dagtekin",
                "Fatih Balci", "Mevlut Cetin", "Ali Turkoglu", "Metin Beyhan", "Ozkan Arikan"};

        for (int i = 0; i < classmates.length; i++) {
            String initials = classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1);
            System.out.println(initials);
        }
    }
}

