package Polymorphism;
class Bike{
    int speedlimit = 90;
}
class Honda extends Bike {
    int speedlimit = 120;
    public static void main(String args[]){
        Bike obj = new Bike();
        System.out.println(obj.speedlimit);
    }
}

public class DataMember {
}
