class Vehicle {
    public void go() {
    }
}

class Car extends Vehicle {
    public void go() {
        System.out.println("The car is moving");
    }
}

class Bicycle extends Vehicle {
    public void go() {
        System.out.println("The bicycle is moving");
    }
}

class Boat extends Vehicle {
    public void go() {
        System.out.println("The boat is moving");
    }
}

public class Poly {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] race = {car, bike, boat};

        for(Vehicle x : race) {
            x.go();
        }
    }
}
/*
The car is moving
The bicycle is moving
The boat is moving
 */