package MMIT;
class Address {
    int streetNum;
    String city;
    String state;
    String country;

    public Address(int streetNum, String city, String state, String country) {
        this.streetNum = streetNum;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Student{
    int rollNum;
    String studentName;
    Address studentAddress;

    public Student(int rollNum, String studentName, Address studentAddress) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
}
class University{
    String universityName;
    Address uniAddress;
    public University(String universityName, Address uniAddress) {
        this.universityName = universityName;
        this.uniAddress = uniAddress;
    }
}
class Staff{
    String staffName;
    Address staffAddress;

    public Staff(String staffName, Address staffAddress) {
        this.staffName = staffName;
        this.staffAddress = staffAddress;
    }
}
public class Aggregation {
    public static void main(String args[]){
        Address address = new Address(55,"Yangon","Yangon","Myanmar");
        Student student = new Student(1,"AAA",address);
        System.out.println(student.studentAddress.city);
        University university = new University("UCSY",address);
        System.out.println(university.uniAddress.city);
    }
}
