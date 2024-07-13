//package Java_Day-5_oops.overloaded_construct;

public class Main {
    public static void main(String[] args) {
        
        Food food = new Food("apple","banana", "Mango");
        System.out.println("heelloooo overloading");

        System.out.println(food.bread);
        System.out.println(food.sauce);
        System.out.println(food.cheese);
        System.out.println(food.topping);

    }
}
/*
    heelloooo overloading
    apple
    banana
    Mango
    null
 */