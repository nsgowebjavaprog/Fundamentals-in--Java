abstract class Vehicle
    {
    abstract void go();
}

class Car extends Vehicle{  

    // ---*****---
    @Override
    void go(){
        System.out.println("The Driver is Drawing a CAR");
    }    
}

public class Abstract_Java {
    public static void main(String[] args) {
        
        Car car = new Car();

        car.go();   //The Driver is Drawing a CAR

    }
}
