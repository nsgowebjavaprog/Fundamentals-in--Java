import java.util.*;

public class Methods {
    public static void main(String[] args) {
        
        // Method ----> A Block of Code That is Executed whenever is it called UPON
      // 1.
        /*   
        String name = "Nagaraj LOni";
        int age = 20;

        hello(name, age);

    }
    static void hello(String name, int age){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    
         Name is: Nagaraj LOni
         Age is: 20
         */

        // 2.

        int a = 20; 
        int b = 10;
        int res = add(a,b);

        System.out.println(res);
    }
    static int add(int a, int b){

        int res = a+b;
        return res;         // 30
    }
}