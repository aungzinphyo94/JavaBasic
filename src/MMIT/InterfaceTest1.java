package MMIT;
interface Bank{
    float rateofInterest();
}
class KBZ implements Bank{

    @Override
    public float rateofInterest() {
        return 8.0f;
    }
}
class AYA implements Bank {

    @Override
    public float rateofInterest() {
        return 8.5f;
    }
}
public class InterfaceTest1 {
    public static void main(String args[]){
        Bank bank = new KBZ();
        System.out.println("ROI : "+bank.rateofInterest());
    }
}
