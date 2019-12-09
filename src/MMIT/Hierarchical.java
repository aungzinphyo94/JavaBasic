package MMIT;
class Final_Student{
    public void study() {
        System.out.println("English");
    }
}
class CS extends Final_Student{
    public void additionCS(){
        System.out.println("Software Engineering");
    }
}
class CT extends Final_Student{
    public void additionCT(){
        System.out.println("Networking");
    }
}
public class Hierarchical {
    public static void main(String args[]){
        CS cs = new CS();
        cs.additionCS();
        cs.study();

        CT ct= new CT();
        ct.additionCT();
        ct.study();
    }
}
