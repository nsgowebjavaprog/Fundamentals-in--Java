import java.util.*;

public class Switch {
    public static void main(String[] args) {
        
        System.out.println("Enter the Day: ");

        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine();
        
        switch (day) {
            case "sunday":System.out.println("It is Sunday");
            break;
            case "monday":System.out.println("It is Monday");
            break;
            case "friday":System.out.println("It is friday");
            break;
            case "saturday":System.out.println("It is saturday");
            break;
            default:System.out.println("Enter correct day!");
                break;
        }
    }
}
