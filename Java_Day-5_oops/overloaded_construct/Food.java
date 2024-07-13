//package Java_Day-5_oops.overloaded_construct;

public class Food {
    
    String bread;
    String sauce;
    String cheese;
    String topping;

    Food(String bread, String sauce, String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Food(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
