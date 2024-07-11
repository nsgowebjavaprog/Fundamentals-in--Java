import java.util.*;

public class Maths {
    public static void main(String[] args) {
       
        float a = 11.3f;
        float b = 23.7f;

        float maximum = Math.max(a,b);
        float minimum = Math.min(a,b);
        float absolute = Math.abs(a);
        double square = Math.sqrt(a);
        int rounded = Math.round(a);
        double ceil_is = Math.ceil(a);   // 12.0
        double floor_is = Math.floor(b);  // 23.0


        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(absolute);
        System.out.println(square);
        System.out.println(rounded);
        System.out.println(ceil_is);
        System.out.println(floor_is);

    }
}
