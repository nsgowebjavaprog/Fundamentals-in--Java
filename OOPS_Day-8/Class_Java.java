// Data Type Creation
// Class Creation
class Student{
    String name;
    int roll_num;
    double percent;
}

public class Class_Java {
    public static void main(String[] args) {
    Student s = new Student();
    s.name =  "Nagaraj Loni";
    s.roll_num = 55;
    s.percent = 92.20;
    System.out.println(s.name);

    Student s2 = new Student();
    s2.name = "LONI";
    s2.roll_num = 56;
    s2.percent = 0.02;

    System.out.println(s2.name);
    }
}
