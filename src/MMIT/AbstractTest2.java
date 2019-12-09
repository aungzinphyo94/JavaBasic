package MMIT;
abstract class City{
    abstract String getNameOfState();
}
class Monywa extends City {

    @Override
    String getNameOfState() {
        return "Sagaing Division";
    }
}
class Mandalay extends City {

    @Override
    String getNameOfState() {
        return "Mandalay Division";
    }
}
public class AbstractTest2 {
    public static void main(String args[]){
        City city;
        city = new Mandalay();
        System.out.println(city.getNameOfState());
        city = new Monywa();
        System.out.println(city.getNameOfState());
    }
}
