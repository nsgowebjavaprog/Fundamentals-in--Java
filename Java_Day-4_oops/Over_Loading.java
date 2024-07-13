
public class Over_Loading {
    public static void main(String[] args) {
        
        //overloading:- methods that share the same name 
        // but have different parameters methods name + parameters =  method gnature
        
        int x = add(10,20);
        System.out.println(x);

        int y = add(10,20,30);
        System.out.println(y);

        int z = add(10,20,30,40);
        System.out.println(z);


        double q = add(10.30,20.2323);
        System.out.println(q);
    }
    static int add(int a, int b){
        System.out.println("This is a Overloaded Method #1");
        return a+b;
    }

    static int add(int a, int b, int c){
        System.out.println("This is a Overloaded Method #2");
        return a+b+c;
    }
    static int add(int a, int b, int c,int d){
        System.out.println("This is a Overloaded Method #3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("This is a Overloaded Method #1");
        return a+b;
    }
    /*
    This is a Overloaded Method #1
    30.5323
     */
}
/*
This is a Overloaded Method #1
30
This is a Overloaded Method #2
60
This is a Overloaded Method #3
100
 */