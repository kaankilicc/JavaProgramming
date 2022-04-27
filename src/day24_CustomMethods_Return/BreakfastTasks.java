package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Kaan","Kılıç");
        System.out.println(" ");
        domain("avkaankilic@gmail.com");
        System.out.println(" ");
        String[]emails={"josh@gmail.com","Jim@yahoo.com","Elminur@cydeo.com","gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        nameOfMonth(8);
        }
    public static void initials(String firstName,String lastName){
        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);
    }
    public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
            System.out.println("domain = "+domain);
    }
    public static void nameOfMonth(int number){
        String name="";
        if (number>=1&&number<=12){
            name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"April":(number==5)?"May":(number==6)?"June":
                    (number==7)?"July":(number==8)?"August":(number==9)?"Sep":(number==10)?"October":(number==11)?"November":"December";
        }else{
           name="Invalid";
        }
        System.out.println("name = " + name);
    }

}
