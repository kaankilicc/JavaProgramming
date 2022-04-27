package day20_Array;

public class Task02 {
    public static void main(String[] args) {

        String[] classmates = {"Yasin Karadag", "Ali Cimen", "Ekrem Mus", "Erol Aksel", "Suleyman Dagtekin",
                "Fatih Balci", "Mevlut Cetin", "Ali Turkoglu", "Metin Beyhan", "Ozkan Arikan"};
        for (int i = 0; i < classmates.length; i++) {
            String names = classmates[i];
            String reverse = "";
            for (int j = names.length()-1; j >=0 ; j--) {
                reverse += names.charAt(j);
            }
            System.out.println(reverse);
        }
    }
}
