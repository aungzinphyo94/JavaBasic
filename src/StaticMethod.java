class Studet{
    int rollno;
    String name;
    static String college = "UCSMonywa";
    //static method to change the value of static variable
    static void change(){
        college = "Computer University of Studies Monywa";
    }
    //constructor to initialize the variable
    Studet(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class StaticMethod {
    int anInt = 40;
    public static void main(String args[]){
        Student.change();//calling change method
        //creating objects
        Studet s1 = new Studet(111,"Mya");
        Studet s2 = new Studet(222,"Aye");
        Studet s3 = new Studet(333,"Soe");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
//        System.out.println(anInt);
    }
}
