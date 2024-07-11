import java.util.*;

public class Area {
    public static void main(String[] args) {
        
        double a;
        double b;
        double area;

        Scanner side = new Scanner(System.in);

        System.out.println("Enter A side: ");
        a = side.nextDouble();
        System.out.println("Enter B side: ");
        b = side.nextDouble();

        area = Math.sqrt((a*a)+(b*b));
        System.out.println("Area Is: "+area);

    }
}
/*
 Enter A side: 
4
Enter B side:
5
Area Is: 6.4031242374328485
 */