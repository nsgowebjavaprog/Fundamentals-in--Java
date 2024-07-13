import java.util.ArrayList;

public class ArrayList_Java{
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();

        food.add("Apple");
        food.add("mango");
        food.add("Banana");
        food.add("Orenage");
        food.add("Lemon");

        food.set(0,"Watemilen");

        food.remove(2);
        /*
            Watemilen
            mango
            Orenage
            Lemon
         */

        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
