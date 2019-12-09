package MMIT;
class Car{
    void drive(){
        System.out.println("driving");
    }
}
public class Mercedes extends Car{
    void drive(){
        System.out.println("driving with 120km");
    }
    public static void main(String args[]){
        Car car = new Mercedes();
        car.drive();
    }
}
