// Data Hiding

// Abstraction

abstract class Animal{
    public void walk(){

    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("4------legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("2------legs");
    }
}

public class Ena_Caps {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();   // 4------legs

        Chicken c = new Chicken();
        c.walk();    // 2------legs
    }    
}
