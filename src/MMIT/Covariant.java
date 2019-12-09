package MMIT;
class A1{
    A1 get(){
        return this;
    }
}

public class Covariant  extends A1{
    Covariant get(){
        return this;
    }
    void message(){
        System.out.println("Welcome to covariant");
    }
    public static void main(String args[]){
        new Covariant().get().message();
    }}
