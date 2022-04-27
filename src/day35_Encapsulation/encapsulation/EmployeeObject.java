package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee e1=new Employee("Tatiana",'F',28,11000);
        System.out.println(e1);

        Employee e2=new Employee("Aygun",'F',31,11550);
        e2.setSalary(e2.getSalary()+1500);
        System.out.println(e2);
    }
}
