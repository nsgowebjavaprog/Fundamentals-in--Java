import java.util.*;

public class Tow_D_ArrList
{
 public static void main(String[] args) 
 {
  
    ArrayList<String> food = new ArrayList();
    food.add("pasta");
    food.add("Donuts");
    food.add("Pizza");

    System.out.println(food);  //[pasta, Donuts, Pizza]

    ArrayList<String> veg = new ArrayList();
    veg.add("Apple");
    veg.add("Banana");

    System.out.println(veg);  //[Apple, Banana]

    ArrayList<String> Non_Veg = new ArrayList<>();
    Non_Veg.add("Ciken");
    Non_Veg.add("Biriyani");

    System.out.println(Non_Veg);

    //Finallllllly

    ArrayList<ArrayList<String>> Last_Output = new ArrayList<>();
    Last_Output.add(food);
    Last_Output.add(veg);
    Last_Output.add(Non_Veg);

    System.out.println(Last_Output);
    // [[pasta, Donuts, Pizza], [Apple, Banana], [Ciken, Biriyani]]

 }   
}
