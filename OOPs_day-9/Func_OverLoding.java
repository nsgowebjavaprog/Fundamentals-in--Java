class Student{
    String name;
    int age;

    public void print_info(String name){
        System.out.println(name);
    }
    
    public void print_info(int age){
        System.out.println(age);
    }
    
    public void print_info(String name,int age){
        System.out.println(name+" , "+age);
    }
}

public class Func_OverLoding {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Nagaraj";
        s.age = 21;

        s.print_info(s.name, s.age);  // Nagaraj , 21
    }
}
