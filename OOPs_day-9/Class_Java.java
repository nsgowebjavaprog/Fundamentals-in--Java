// 1.
class Pen{
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    public void print_color(){
        System.out.println(this.color);
    }
}

//2.
class Student{
    String name;
    int age;

    public void print_info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class Class_Java {
    public static void main(String[] args) {
        

        // 1. Pen
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "BallPen";

        pen1.write(); //  Writing Something

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "BallPoint";

        pen1.print_color();   //Black
        pen2.print_color(); //Blue
       
        // 2. Student
        Student s = new Student();
        s.name = "Nagaraj";
        s.age = 20;
        s.print_info();  //Naagaraj
                         //20
    }
}
