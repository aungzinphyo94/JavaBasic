package Abstraction;
interface Bank{
    float rateOfInterest();
}
class KBZ implements Bank{
    @Override
    public float rateOfInterest() {
        return 9.0f;
    }
}
class AYA implements Bank {

    @Override
    public float rateOfInterest() {
        return 9.5f;
    }
}
public class TestInterface1 {
    public static void main(String args[]){
        Bank bank = new KBZ();
        System.out.println("ROI: "+bank.rateOfInterest());
    }
}
