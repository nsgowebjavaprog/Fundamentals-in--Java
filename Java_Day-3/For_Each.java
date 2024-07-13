import java.util.ArrayList;

public class For_Each {
    public static void main(String[] args) {
        
        String[] animals = {"Cat","Dog","Rat","Rabbit"};
        for(String i : animals){
            System.out.println(i);
        }
        /*
         Cat
        Dog
        Rat
        Rabbit
         */

        // Using ArrayList

        ArrayList<String> ANIMALS = new ArrayList<>();
        ANIMALS.add("CAT");
        ANIMALS.add("RAT");
        ANIMALS.add("BAT");

        for(String i : ANIMALS){
            System.out.println(i);
            /*
             *  CAT
                RAT
                BAT
             */
        }

    }
}
