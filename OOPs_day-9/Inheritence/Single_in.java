class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of Triangle: " + 0.5 * l * h);
    }
}

public class Single_in {
    public static void main(String[] args) {
        int l = 10;
        int h = 10;
        
        Triangle triangle = new Triangle();
        triangle.area(l, h);

        // Area of Triangle: 50.0
    }
}