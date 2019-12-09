package MMIT;
class Bike{
    int speed = 90;
}
class Honda extends Bike{
    int speed = 120;
}
public class DataMember {
    public static void main(String args[]){
        Bike bike = new Honda();
        System.out.println(bike.speed);
    }
}
