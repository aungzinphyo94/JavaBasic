package Inheritance;

class A {
    public void methodA(){
        System.out.println("Class A method");
    }
}
class B extends A {
    public void methodB(){
        System.out.println("class B method");
    }
}
public class Multilevel extends B{
    public void methodC(){
        System.out.println("class C method");
    }
    public static void main(String args[]){
        Multilevel multilevel = new Multilevel();
        multilevel.methodA();
        multilevel.methodB();
        multilevel.methodC();

        B b = new B();
        b.methodA();
        b.methodB();

        A a = new A();
        a.methodA();
    }
}
