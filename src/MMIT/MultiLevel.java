package MMIT;
class A{
    public void methodA(){
        System.out.println("Class A method");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("class B method");
    }
}
public class MultiLevel extends B{
    public void methodMulti(){
        System.out.println("class MultiLevel method");
    }
    public static void main(String args[]){
        MultiLevel multiLevel = new MultiLevel();
        multiLevel.methodA();
        multiLevel.methodB();
        multiLevel.methodMulti();

    }
}
