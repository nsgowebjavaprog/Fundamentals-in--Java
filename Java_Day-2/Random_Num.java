import java.util.*;

public class Random_Num {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int a = random.nextInt();
        float b = random.nextFloat();
        double c = random.nextDouble();
        boolean d  = random.nextBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }    
}
/*
 -1253623929
0.35633653
0.3552323936035712
true
 */