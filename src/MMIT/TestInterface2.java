package MMIT;
interface Address1{
    void showAddress();
}
interface College{
    void showCollege();
}
public class TestInterface2 implements College,Address1 {
    @Override
    public void showAddress() {
        System.out.println("Monywa");
    }

    @Override
    public void showCollege() {
        System.out.println("Computer University");
    }

    public static void main(String[] args){
        TestInterface2 obj = new TestInterface2();
        obj.showCollege();
        obj.showAddress();
    }
}
