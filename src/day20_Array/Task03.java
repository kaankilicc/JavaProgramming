package day20_Array;

public class Task03 {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int index = 0;
        boolean contained = false;
        String report = "";
        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int itemId = itemIDs[i];
            if(item.equals("Gloves")){
                index = i;
            }
            if(item.equals("iPad")){
                contained = true;
            }
            report += item+"-"+price+"-"+itemId+"\n";
        }
        System.out.println("index = " + index);
        System.out.println("contained = " + contained);
        System.out.println("report = " + report);
    }
}
