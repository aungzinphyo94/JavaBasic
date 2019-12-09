package Inheritance;

class Employee{
   float salary = 400000;
}
class Programmer extends Employee{
   int bonus = 100000;
   public static void main(String args[]){
      Programmer programmer = new Programmer();
      System.out.println("Programmer salary is:"+ programmer.salary);
      System.out.println("Bonus of Programmer is:"+programmer.bonus);
   }
}
