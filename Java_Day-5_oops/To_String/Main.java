//package Java_Day-5_oops.To_String;

public class Main {
  public static void main(String[] args) {
    
    Car car = new Car();

    System.out.println(car);  //Car@28a418fc ---memory adr
    System.out.println("------------------------");
    System.out.println(car.toString());
/*
Ford
Mustang
Red
2024

Ford
Mustang
Red
2024
 */
  }  
}
