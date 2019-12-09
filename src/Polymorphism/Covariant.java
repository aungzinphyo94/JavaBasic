package Polymorphism;
class A{
    A get(){
        return this;
    }
}
public class Covariant extends A{
    Covariant get(){
        return this;
    }
    void message() {
        System.out.println("Welcome to Covariant");
    }
    public static void main(String args[]){
        new Covariant().get().message();
    }
}
