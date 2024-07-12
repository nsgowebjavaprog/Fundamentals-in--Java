import java.util.*;

public class Array {
    public static void main(String[] args) {
        
        String[] car = {"Car-0","Car-1","Car-2"};

        System.out.println(car);   //[Ljava.lang.String;@372f7a8d
        // (memory location)
        System.out.println(car[1]);

        car[1] = "CAR-1";
        System.out.println(car[1]);

//USER

        String[] name = new String[3];
        name[0] = "NS-LONI";
        name[1] = "SN-LONI";
        name[2] = "VN-LONI";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
