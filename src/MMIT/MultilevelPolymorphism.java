package MMIT;
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating fruits");
    }
}
class BabyDog extends Dog {
    void eat(){
        System.out.println("drinking milk");
    }
}
public class MultilevelPolymorphism {
    public static void main(String args[]){
        Animal animal1, animal2, animal3;
        animal1 = new Animal();
        animal2 = new Dog();
        animal3 = new BabyDog();
        animal1.eat();
        animal2.eat();
        animal3.eat();
    }
}
