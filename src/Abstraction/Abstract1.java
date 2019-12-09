package Abstraction;
abstract class City{
    abstract String getNameOfState();
}
class Monywa extends City {
    String getNameOfState(){
        return "Sagaing";
    }
}
class Pathein extends City {
    String getNameOfState(){
        return "Ayawady";
    }
}
public class Abstract1 {
    public static void main(String args[]){
        City city;
        city = new Monywa();
        System.out.println(city.getNameOfState());
        city = new Pathein();
        System.out.println(city.getNameOfState());
    }
}
