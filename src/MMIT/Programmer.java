package MMIT;
class Employee{
    float salary = 400000;
}
public class Programmer extends Employee{
    int bonus = 100000;
    public static void main(String args[]){
        Programmer programmer = new Programmer();
        System.out.println(programmer.salary);
        System.out.println(programmer.bonus);
    }
}
