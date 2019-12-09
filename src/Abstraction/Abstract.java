package Abstraction;

abstract class Student{
     abstract void study();
}
public class Abstract extends Student {
    void study(){
        System.out.println("Study at UCS");
    }
    public static void main(String args[]){
        Student student = new Abstract();
        student.study();
    }
}
