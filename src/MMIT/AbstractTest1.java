package MMIT;
abstract class Student_1{
        abstract void study();
}
public class AbstractTest1 extends Student_1{
    @Override
    void study() {
        System.out.println("Study");
    }
    public static void main(String args[]){
        Student_1 student = new AbstractTest1();
        student.study();
    }
}
