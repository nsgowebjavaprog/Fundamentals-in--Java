class Vehicle{
    double speed;

    void go(){
        System.out.println("This Vahicle is Moving");
    }

    void stop(){
        System.out.println("This Vehicle is Stoped");
    }
}
class Bicyicle extends Vehicle {

    int wheels = 2;
    int pedals = 2;
    
}
class Car extends Vehicle{

    int wheels = 4;
    int doors = 4;

}

public class Inheritance_Java {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.go();

        Bicyicle bike = new Bicyicle();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
/*
This Vahicle is Moving
This Vehicle is Stoped
4
2
 */

 