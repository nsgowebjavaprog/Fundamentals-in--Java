import java.util.*;

public class Printf_Method {
    public static void main(String[] args) {
        boolean my_boolean = true;
        char my_char = '@';
        String name = "NSLONI";

        System.out.printf("Boolean value: %b%n", my_boolean);
        System.out.printf("Character: %c%n", my_char);
        System.out.printf("String: %10s%n", name);//String:     NSLONI
}
}