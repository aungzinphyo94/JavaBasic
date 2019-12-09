package Abstraction;
interface Address{
    void showAddress();
}
interface University{
    void showUniversity();
}
public class TestInterface2 implements University,Address {
    @Override
    public void showAddress() {
        System.out.println("Monywa");
    }

    @Override
    public void showUniversity() {
        System.out.println("Computer University");
    }
    public static void main(String args[]){
        TestInterface2 obj = new TestInterface2();
        obj.showAddress();
        obj.showUniversity();
    }
}

