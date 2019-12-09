class Student {
    int rollno;
    String name;
    static String university = "UCSMonywa";

    static void change(){

        university = "Computer University";
    }

    Student(int r, String name){
        rollno = r;
        name = name;
    }

    void display() {
        System.out.println(rollno + " "+name + " "+university);
    }
}

public class CommonStatic {
            public static void main(String args[]) {
                Student.change();
                Student s1 = new Student(11, "AA");
                Student s2 = new Student(22, "BB");
                s1.display();
                s2.display();
    }
}
