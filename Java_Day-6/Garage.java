class Car {
    String name;

    Car(String name) {
        this.name = name;
    }
}

public class Garage{
    void park(Car car){
        System.out.println("The "+car.name+"is parked in the garage");
    }
}