package day41_Exceptions;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        try {
            System.out.println("Java".charAt(-1));
        }catch(RuntimeException e){
            e.printStackTrace();
        }








    }
}
