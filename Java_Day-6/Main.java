class Car {
    String name;

    Car(String name) {
        this.name = name;
    }
}

class Garage {
    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the garage");
    }
}

public class Main {
    public static void main(String[] args) {
        Garage g = new Garage();

        Car car1 = new Car("BMTS");
        Car car2 = new Car("KSRTC");

        g.park(car1);
        g.park(car2);
    }
}

/*
 The BMTS is parked in the garage
The KSRTC is parked in the garage
 */