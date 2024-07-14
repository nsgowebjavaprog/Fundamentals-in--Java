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

class Eq_Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of Triangle: " + 2* l * h);
    }
}

public class Hybrid_in {
    public static void main(String[] args) {
        int l = 10;
        int h = 10;
        
        Triangle triangle = new Triangle();
        triangle.area(l, h);

        Eq_Triangle et = new Eq_Triangle();
        et.area(l,h);

        //Area of Triangle: 50.0
        //Area of Triangle: 200
    }
}

