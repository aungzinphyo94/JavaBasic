package MMIT;
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Emp extends Person{
    float salary;

    public Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class SuperKeyword {
    public static void main(String args[]){
        Emp e = new Emp(1,"AAA",450000);
        e.display();
    }
}
