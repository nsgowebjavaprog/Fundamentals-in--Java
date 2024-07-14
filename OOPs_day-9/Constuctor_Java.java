
class Student{
    String name;
    int age;

    public void print_info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
// par Constuctor

    Student(String name, int age) {
    this.name = name;
    this.age = age;
    }
// Nagaraj
// 20


// Non-para Constuctor

//     Student() {
//         System.out.println("Constructor Called");
//     }
// }
// Constructor Called
// Nagaraj
// 20
}
public class Constuctor_Java {
    
    public static void main(String[] args) {

        Student s = new Student("Nagaraj", 20);
        s.print_info();

        /*
        Student s = new Student();
        s.name = "Nagaraj";
        s.age = 20;
        s.print_info();  */
    }
}
